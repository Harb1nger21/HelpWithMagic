package Project.Frame;

import Project.Frame.Components.*;
import Project.Frame.Components.Buttons.*;
import Project.Frame.Components.lables.Category;
import Project.Frame.Components.lables.Headmen;
import Project.Frame.Components.lables.LabelsType;
import Project.Frame.Components.lables.MagLabel;

import javax.swing.*;
import java.awt.*;

import static Project.utils.Sizes.*;

//Главный фрейм

public class GeneralFrame extends JFrame {

    private static TableModel tableModel;
    private static final JLabel magicCategory = Category.getInstance();

    public GeneralFrame() {
        setBounds(0, 0, DESKTOP_WIDTH, DESKTOP_HEIGHT);
        setTitle("Help With Magic");

        add(Headmen.getInstance());

        tableModel = new TableModel();
        JTable jTable = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(jTable);
        jTable.setPreferredScrollableViewportSize(new Dimension(1200, 100));
        add(scroll);
        scroll.setBounds(START_X, START_Y * 3, DESKTOP_WIDTH - START_X * 2, DESKTOP_HEIGHT - 250);

        add(magicCategory);
        addButtons();
        addColumnLabels();

        MagicMouseListener mouseListener = new MagicMouseListener(jTable);
        jTable.addMouseListener(mouseListener);

        addAddComponents(new AddButton(tableModel));
        add(new DeleteButton(tableModel, mouseListener));
        add(new SortButton(tableModel));
        add(new SaveButton(tableModel));

        revalidate();
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static TableModel getTableOfMagicians() {
        return tableModel;
    }

    public static JLabel getMagicCategory() {
        return magicCategory;
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

    private void addAddComponents(AddButton button) {
        for (JTextField field : button.getFields()) {
            add(field);
        }
        add(button);
    }
}