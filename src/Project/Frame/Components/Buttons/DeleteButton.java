package Project.Frame.Components.Buttons;

import Project.Frame.Components.MagicMouseListener;
import Project.Frame.Components.TableModel;

import javax.swing.*;

//Удаляет выбранного мышью участника из таблицы

public class DeleteButton extends AbstractChangeButton {
    private final TableModel table;
    private final MagicMouseListener listener;

    public DeleteButton(TableModel table, MagicMouseListener listener) {
        super("Удалить");
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