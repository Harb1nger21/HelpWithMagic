package Project.Frame.Components;

import Project.Magician;

import javax.swing.*;

//Кнопка сортировки после жеребьевки

public class SortButton extends JButton {
    TableOfMagicians table;

    public SortButton(String text, TableOfMagicians table) {
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
