package Project.Frame.Components;

import Project.model.Magician;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

//Модель таблицы участников

public class TableModel extends AbstractTableModel {
    private ArrayList<Magician> listOfMagicians;

    public TableModel() {
        super();
    }

    public void setListOfMagicians(ArrayList<Magician> listOfMagicians) {
        this.listOfMagicians = listOfMagicians;
    }

    public ArrayList<Magician> getListOfMagicians() {
        return listOfMagicians;
    }

    @Override
    public int getRowCount() {
        return listOfMagicians.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 -> listOfMagicians.get(rowIndex).setFirstName((String) value);
            case 1 -> listOfMagicians.get(rowIndex).setSecondName((String) value);
            case 2 -> listOfMagicians.get(rowIndex).setCountry((String) value);
            case 3 -> listOfMagicians.get(rowIndex).setCity((String) value);
            case 4 -> listOfMagicians.get(rowIndex).setPhoneNumber((String) value);
            case 5 -> listOfMagicians.get(rowIndex).setLotNumber((String) value);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> listOfMagicians.get(rowIndex).getFirstName();
            case 1 -> listOfMagicians.get(rowIndex).getSecondName();
            case 2 -> listOfMagicians.get(rowIndex).getCountry();
            case 3 -> listOfMagicians.get(rowIndex).getCity();
            case 4 -> listOfMagicians.get(rowIndex).getPhoneNumber();
            case 5 -> listOfMagicians.get(rowIndex).getLotNumber();
            default -> "";
        };
    }

    @Override
    public String getColumnName(int c) {
        return switch (c) {
            case 0 -> "Имя";
            case 1 -> "Фамилия";
            case 2 -> "Страна";
            case 3 -> "Город";
            case 4 -> "Номер телефона";
            case 5 -> "Жеребьевка";
            default -> "";
        };
    }
}
