package xxl.app.search;

import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import xxl.Spreadsheet;

/**
 * Command for searching function names.
 */
class DoShowFunctions extends Command<Spreadsheet> {

    DoShowFunctions(Spreadsheet receiver) {
        super(Label.SEARCH_FUNCTIONS, receiver);
    }

    @Override
    protected final void execute() {
        String operator = Form.requestString(Prompt.searchFunction());

        for(String value: _receiver.showFunction(operator)){
            _display.popup(value);
        }
    }

}