package forTests;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MyTableModel extends AbstractTableModel {
    public List<Human> humans;

    MyTableModel(List<Human> humans){
        super();
        this.humans = humans;
    }

    @Override
    public int getRowCount() {
        return humans.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> humans.get(rowIndex).getName();
            case 1 -> humans.get(rowIndex).getSurname();
            case 2 -> humans.get(rowIndex).getTelephone();
            default -> "";
        };
    }


    @Override
    public String getColumnName(int c){
        return switch (c) {
            case 0 -> "Name";
            case 1 -> "Surname";
            case 2 -> "Telephone";
            default -> "";
        };
    }

}
