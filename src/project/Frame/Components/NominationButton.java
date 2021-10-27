package project.Frame.Components;

import project.model.Magician;
import project.model.Nomination;

import javax.swing.*;
import java.util.ArrayList;

//Кнопка номинации конкурса
//Отображает список участников в номинации
//Отображает название активной таблицы

public class NominationButton extends JButton {
    private final ArrayList<Magician> magicians = new ArrayList<>();
    private final TableOfMagicians table;
    private final JLabel label;
    private final Nomination nomination;
    private SaveButton saveButton;

    public NominationButton(Nomination nomination, TableOfMagicians table, JLabel label, SaveButton saveButton) {
        super(nomination.getTitle());
        this.nomination = nomination;
        this.table = table;
        table.setListOfMagicians(magicians);
        this.label = label;
        this.label.setText(nomination.getTitle());
        this.saveButton = saveButton;
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            label.setText(NominationButton.super.getText());
            table.setListOfMagicians(magicians);
            saveButton.setNomination(nomination);
            table.fireTableDataChanged();
        });
    }
}