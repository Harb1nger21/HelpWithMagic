package Project.Frame.Components;

import javax.swing.*;

//Удаляет выбранного мышью участника из таблицы

public class DeleteButton extends JButton {
    TableOfMagicians table;
    MagicMouseListener listener;

    public DeleteButton(String text, TableOfMagicians table, MagicMouseListener listener) {
        super(text);
        this.table = table;
        this.listener = listener;
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            table.getListOfMagicians().remove(listener.getRow());
            table.fireTableDataChanged();
        });
    }
}