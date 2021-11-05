package Project.Frame.Components.Buttons;

import Project.Frame.Components.TableModel;
import Project.Frame.Components.TextField.TextField;
import Project.model.Magician;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Кнопка добавления участника конкурса в таблицу

public class AddButton extends AbstractChangeButton {
    private final List<JTextField> fields = new ArrayList<>();
    private final TableModel table;

    public AddButton(TableModel table) {
        super("Добавить");
        this.table = table;
        for (int i = 0; i < 5; i++) {
            fields.add(new TextField());
        }
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            table.getListOfMagicians().add(new Magician(
                    fields.get(0).getText(),
                    fields.get(1).getText(),
                    fields.get(2).getText(),
                    fields.get(3).getText(),
                    fields.get(4).getText())
            );

            table.fireTableDataChanged();

            fields.get(0).setText("");
            fields.get(1).setText("");
            fields.get(2).setText("");
            fields.get(3).setText("");
            fields.get(4).setText("");
        });
    }

    public List<JTextField> getFields() {
        return fields;
    }
}