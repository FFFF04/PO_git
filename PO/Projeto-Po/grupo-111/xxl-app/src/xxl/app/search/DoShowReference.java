package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import xxl.Types.*;
import xxl.Spreadsheet;

/**
 * Command for searching content values.
 */
class DoShowReference extends Command<Spreadsheet> {

    DoShowReference(Spreadsheet receiver) {
        super("Mostrar Referencias", receiver);
    }

    @Override
    protected final void execute() {
        for(int ix = 1; ix <= _receiver.getStorage().getLines(); ix++){
            for(int jx = 1; jx <= _receiver.getStorage().getColumns(); jx++){
                Cell value = _receiver.getStorage().getCell(String.valueOf(ix), 
                    String.valueOf(jx));
                try{
                    Reference op = (Reference) value.getValue();
                    op.getValue();
                    String coord = String.valueOf(ix) + ";" + 
                        String.valueOf(jx);
                    _display.popup(coord + "|" + _receiver.getValues(coord).get(0));
                }
                catch(ClassCastException e){}
            }
        }
    }

}