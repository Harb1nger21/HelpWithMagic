package Project.Frame.Components.Buttons;

import Project.Frame.Components.TextField.TextField;
import Project.Frame.GeneralFrame;
import Project.model.Magician;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Кнопка добавления участника конкурса в таблицу

public class AddButton extends AbstractChangeButton {
    private final List<JTextField> fields = new ArrayList<>();

    public AddButton(GeneralFrame table) {
        super("Добавить");
        for (int i = 0; i < 5; i++) {
            TextField field = new TextField();
            fields.add(field);
            table.add(field);
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
                    fields.get(4).getText()));

            table.fireTableDataChanged();

            for (JTextField field : fields) {
                field.setText("");
            }
        });
    }
}