package Project.Frame.Components;


import javax.swing.*;
import java.awt.*;

import static Project.utils.Sizes.*;

public class ScrollPane extends JScrollPane {
    private final TableModel tableModel = new TableModel();
    private final JTable table = new JTable(tableModel);
    private final MagicMouseListener mouseListener = new MagicMouseListener(table);

    private ScrollPane() {
        new ScrollPane(table);
    }

    private ScrollPane(JTable table) {
        super(table);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 100));
        table.addMouseListener(mouseListener);
        setBounds(START_X, START_Y * 3, DESKTOP_WIDTH - START_X * 2, DESKTOP_HEIGHT - 250);
    }

    public static ScrollPane getInstance() {
        return new ScrollPane();
    }

    public TableModel getModel() {
        return tableModel;
    }

    public JTable getTable() {
        return table;
    }

    public MagicMouseListener getMouseListener() {
        return mouseListener;
    }
}