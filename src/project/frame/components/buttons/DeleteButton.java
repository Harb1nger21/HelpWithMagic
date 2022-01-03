package project.frame.components.buttons;

import project.frame.components.table.MagicMouseListener;

//Удаляет выбранного мышью участника из таблицы

public class DeleteButton extends AbstractChangeButton {
    private final MagicMouseListener listener = MagicMouseListener.getInstance();

    public DeleteButton() {
        super("Удалить");
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            table.getListOfMagicians().remove(listener.getRow());
            table.fireTableDataChanged();
        });
    }
}