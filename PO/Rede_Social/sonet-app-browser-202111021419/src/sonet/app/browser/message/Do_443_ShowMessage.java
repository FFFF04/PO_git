package sonet.app.browser.message;

import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import sonet.app.browser.exceptions.UnknownMessageKeyException;
import sonet.app.browser.visitors.RenderDocumentDetailed;
import sonet.app.browser.visitors.RenderDocumentSummary;
import sonet.core.AgentProxy;
import sonet.core.exceptions.RestrictedOperationException;
import sonet.core.exceptions.UnknownEmailMessageException;

/**
 * Show message.
 */
class Do_443_ShowMessage extends Command<AgentProxy> {

  /** @param receiver */
  public Do_443_ShowMessage(AgentProxy receiver) {
    super(Label.SHOW_MESSAGE, receiver);
  }

  /** @see ist.po.ui.Command#execute() */
  @Override
  protected final void execute() throws CommandException {
    try {
      _receiver.ensureAuthorized();
      RenderDocumentSummary renderer = new RenderDocumentSummary(new RenderDocumentDetailed());
      _receiver.acceptEmailMessageVisitor(Form.requestInteger(Prompt.key()), renderer);
      _display.popup(renderer);
    } catch (UnknownEmailMessageException e) {
      throw new UnknownMessageKeyException(e.getKey());
    } catch (RestrictedOperationException e) {
      // EMPTY: do nothing: must do this to respect output messages
    }
  }
  
}
