package Project.Frame.Components;

import Project.Magician;

import javax.swing.*;
import java.util.ArrayList;

//Кнопка номинации конкурса
//Отображает список участников в номинации
//Отображает название активной таблицы

public class NominationButton extends JButton {
    private ArrayList<Magician> magicians = new ArrayList<>();
    private TableOfMagicians table;
    private JLabel label;

    public NominationButton(String text, TableOfMagicians table, JLabel label) {
        super(text);
        this.table = table;
        table.setListOfMagicians(magicians);
        this.label = label;
        this.label.setText(text);
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            label.setText(NominationButton.super.getText());
            table.setListOfMagicians(magicians);
            table.fireTableDataChanged();
        });
    }
}