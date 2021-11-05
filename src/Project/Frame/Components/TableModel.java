package Project.Frame.Components;

import Project.model.Magician;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

import static Project.Frame.Components.lables.LabelsType.*;

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
        final Magician magician = listOfMagicians.get(rowIndex);
        switch (columnIndex) {
            case 0 -> magician.setFirstName((String) value);
            case 1 -> magician.setSecondName((String) value);
            case 2 -> magician.setCountry((String) value);
            case 3 -> magician.setCity((String) value);
            case 4 -> magician.setPhoneNumber((String) value);
            case 5 -> magician.setLotNumber((String) value);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        final Magician magician = listOfMagicians.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> magician.getFirstName();
            case 1 -> magician.getSecondName();
            case 2 -> magician.getCountry();
            case 3 -> magician.getCity();
            case 4 -> magician.getPhoneNumber();
            case 5 -> magician.getLotNumber();
            default -> "";
        };
    }

    @Override
    public String getColumnName(int c) {
        return switch (c) {
            case 0 -> NAME.getTitle();
            case 1 -> SECOND_NAME.getTitle();
            case 2 -> COUNTRY.getTitle();
            case 3 -> CITY.getTitle();
            case 4 -> PHONE.getTitle();
            case 5 -> LOT_NUMBER.getTitle();
            default -> "";
        };
    }
}