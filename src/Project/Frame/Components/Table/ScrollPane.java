package Project.Frame.Components.Table;


import javax.swing.*;
import java.awt.*;

import static Project.utils.Sizes.*;

public class ScrollPane extends JScrollPane {
    private final JTable table;

    private ScrollPane(JTable jTable) {
        super(jTable);
        table = jTable;
        setPreferredSize(new Dimension(1200, 100));
        setBounds(START_X, START_Y * 3, DESKTOP_WIDTH - START_X * 2, DESKTOP_HEIGHT - 250);
        table.addMouseListener(MagicMouseListener.getInstance());
    }

    public static ScrollPane getInstance() {
        return new ScrollPane(new JTable(TableModel.getInstance()));
    }

    public JTable getTable() {
        return table;
    }
}