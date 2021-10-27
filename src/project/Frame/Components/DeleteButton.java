package project.Frame.Components;

import javax.swing.*;

//Удаляет выбранного мышью участника из таблицы

public class DeleteButton extends JButton {
    private final TableOfMagicians table;
    private final MagicMouseListener listener;

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