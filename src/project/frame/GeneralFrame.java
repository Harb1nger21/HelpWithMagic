package project.frame;

import project.frame.components.buttons.*;
import project.frame.components.table.ScrollPane;
import project.frame.components.lables.Category;
import project.frame.components.lables.Headmen;
import project.frame.components.lables.LabelsType;
import project.frame.components.lables.MagLabel;
import project.frame.components.buttons.Nomination;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static project.utils.Sizes.*;

//Главный фрейм

public class GeneralFrame extends JFrame {
    private static List<NominationButton> nomButtons = new ArrayList<>();

    public GeneralFrame() {
        setBounds(0, 0, DESKTOP_WIDTH, DESKTOP_HEIGHT);
        setTitle("Help With Magic");

        add(Headmen.getInstance());
        add(ScrollPane.getInstance());
        add(Category.getInstance());
        addButtons();
        addColumnLabels();

        revalidate();
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static List<NominationButton> getNomButtons() {
        return nomButtons;
    }

    private void addButtons() {
        for (Nomination nomination : Nomination.values()) {
            NominationButton nomButton = new NominationButton(nomination);
            nomButtons.add(nomButton);
            add(nomButton);
        }
        add(new AddButton(this));
        add(new DeleteButton());
        add(new SortButton());
        add(new SaveButton());
    }

    private void addColumnLabels() {
        final LabelsType[] labelsTypes = LabelsType.values();
        for (int i = 0; i < labelsTypes.length - 1; i++) {
            add(new MagLabel(labelsTypes[i].getTitle()));
        }
    }
}