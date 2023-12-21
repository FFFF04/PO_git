package xxl.app.search;

import java.util.List;

import pt.tecnico.uilib.menus.Command;
import xxl.Spreadsheet;


/**
 * Command for searching function names.
 */
class DoShowPair extends Command<Spreadsheet> {

    DoShowPair(Spreadsheet receiver) {
        super("Procura valores Pares", receiver);
    }

    @Override
    protected final void execute() {

        for(int ix = 1; ix <= _receiver.getStorage().getLines(); ix++){
            for(int jx = 1; jx <= _receiver.getStorage().getColumns(); jx++){
                List<String> values = _receiver.getValues(
                        String.valueOf(ix) + ";" + String.valueOf(jx));
                String[] value = values.get(0).split("=");
                try{
                    int i = Integer.parseInt(value[0]);
                    if (i%2 == 0) {
                        _display.popup(String.valueOf(ix) + ";" + 
                        String.valueOf(jx) + "|" + values.get(0));
                    }
                }
                catch(NumberFormatException e){}
            }
        }
    }

}