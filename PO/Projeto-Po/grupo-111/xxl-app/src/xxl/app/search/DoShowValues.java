package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import xxl.Spreadsheet;

/**
 * Command for searching content values.
 */
class DoShowValues extends Command<Spreadsheet> {

    DoShowValues(Spreadsheet receiver) {
        super(Label.SEARCH_VALUES, receiver);
        addStringField("procurar", Prompt.searchValue());
    }

    @Override
    protected final void execute() {
        String seach = stringField("procurar");

        for(String value: _receiver.showValue(seach)){
            _display.popup(value);
        }
    }

}
