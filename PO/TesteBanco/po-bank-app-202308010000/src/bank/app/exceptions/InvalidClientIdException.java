package bank.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

/**
 * Client id does not exist..
 */
public class InvalidClientIdException extends CommandException {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202010211636L;

  /** @param id */
  public InvalidClientIdException(int id) {
    super(Messages.noSuchClient(id));
  }

}
