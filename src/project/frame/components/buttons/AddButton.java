package project.frame.components.buttons;

import project.frame.AttentionFrame;
import project.frame.components.textField.TextField;
import project.frame.GeneralFrame;
import project.model.Magician;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Кнопка добавления участника конкурса в таблицу

public class AddButton extends AbstractChangeButton {
    private final List<JTextField> fields = new ArrayList<>();

    public AddButton(GeneralFrame frame) {
        super("Добавить");
        for (int i = 0; i < 5; i++) {
            TextField field = new TextField();
            fields.add(field);
            frame.add(field);
        }

        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            String attention = "";
            for (JTextField field : fields) {
                if (field.getText().equals("")) {
                    attention = String.join(", ", attention, field.getName());
                }
            }
            if (!attention.equals("")) {
                new AttentionFrame("Заполните поля " + attention);
            }
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
        SaveButton.setSaveFalse();
    }
}