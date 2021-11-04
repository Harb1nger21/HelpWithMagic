package Project.Frame.Components.Buttons;

import Project.Frame.Components.TableModel;
import Project.model.Magician;

import javax.swing.*;

//Кнопка сортировки после жеребьевки

public class SortButton extends JButton {
    TableModel table;

    public SortButton(String text, TableModel table) {
        super(text);
        this.table = table;
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            table.getListOfMagicians().sort(Magician::compareTo);
            table.fireTableDataChanged();
        });
    }
}
