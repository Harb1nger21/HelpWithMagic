package Project.Frame.Components;

import Project.Magician;
import lombok.Getter;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

@Getter
public class TableOfMagicians extends AbstractTableModel {
    private ArrayList<Magician> listOfMagicians = new ArrayList<>();
    private int nomination = 0;

    public TableOfMagicians() {
        super();
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

    public void setNomination(int nomination) {
        this.nomination = nomination;
    }

    public void setListOfMagicians(ArrayList<Magician> listOfMagicians) {
        this.listOfMagicians = listOfMagicians;
    }
}
