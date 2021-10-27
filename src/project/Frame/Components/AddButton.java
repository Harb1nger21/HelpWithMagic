package project.Frame.Components;

import project.model.Magician;

import javax.swing.*;

//Кнопка добавления участника конкурса в таблицу

public class AddButton extends JButton {
    private final JTextField firstName;
    private final JTextField secondName;
    private final JTextField country;
    private final JTextField city;
    private final JTextField phoneNumber;
    private final TableOfMagicians table;

    public AddButton(
            String name,
            JTextField firstName,
            JTextField secondName,
            JTextField country,
            JTextField city,
            JTextField phoneNumber,
            TableOfMagicians table) {

        super(name);
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.table = table;
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            table.getListOfMagicians().add(new Magician(
                    firstName.getText(),
                    secondName.getText(),
                    country.getText(),
                    city.getText(),
                    phoneNumber.getText())
            );

            table.fireTableDataChanged();

            firstName.setText("");
            secondName.setText("");
            country.setText("");
            city.setText("");
            phoneNumber.setText("");
        });
    }
}
