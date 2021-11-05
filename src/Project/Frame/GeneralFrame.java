package Project.Frame;

import Project.Frame.Components.Buttons.*;
import Project.Frame.Components.Table.ScrollPane;
import Project.Frame.Components.Lables.Category;
import Project.Frame.Components.Lables.Headmen;
import Project.Frame.Components.Lables.LabelsType;
import Project.Frame.Components.Lables.MagLabel;
import Project.Frame.Components.Buttons.Nomination;

import javax.swing.*;

import static Project.utils.Sizes.*;

//Главный фрейм

public class GeneralFrame extends JFrame {

    public GeneralFrame() {
        setBounds(0, 0, DESKTOP_WIDTH, DESKTOP_HEIGHT);
        setTitle("Help With Magic");

        add(Headmen.getInstance());
        add(ScrollPane.getInstance());
        add(Category.getInstance());
        addButtons();
        addColumnLabels();
        add(new AddButton(this));
        add(new DeleteButton());
        add(new SortButton());
        add(new SaveButton());

        revalidate();
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addButtons() {
        for (Nomination nomination : Nomination.values()) {
            add(new NominationButton(nomination));
        }
    }

    private void addColumnLabels() {
        final LabelsType[] labelsTypes = LabelsType.values();
        for (int i = 0; i < labelsTypes.length - 1; i++) {
            add(new MagLabel(labelsTypes[i].getTitle()));
        }
    }
}