package project.frame.components.table;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Для считывания положения мыши в таблице

public class MagicMouseListener extends MouseAdapter {
    private static final MagicMouseListener mouse = new MagicMouseListener();
    private final JTable table;
    private int row;

    private MagicMouseListener() {
        this.table = ScrollPane.getInstance().getTable();
    }

    public static MagicMouseListener getInstance() {
        return mouse;
    }

    public int getRow() {
        return row;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        row = table.rowAtPoint(e.getPoint());
    }
}