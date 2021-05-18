package Project.Frame.Components;

import Project.Magician;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NominationButton extends JButton {
    private ArrayList<Magician> magicians = new ArrayList<>();
    private TableOfMagicians table;
    private JLabel label;

    public NominationButton(String text, TableOfMagicians table, JLabel label) {
        super(text);
        this.table = table;
        this.label = label;
        this.label.setText(text);
        addActionListener();

    }

    public ArrayList<Magician> getMagicians() {
        return magicians;
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            label.setText(NominationButton.super.getText());
            table.setListOfMagicians(magicians);
            table.fireTableDataChanged();
        });
    }
}