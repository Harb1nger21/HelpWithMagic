package Project.Frame.Components;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Для считывания положения мыши в таблице

public class MagicMouseListener extends MouseAdapter {
    private final JTable table;
    private int row;

    public MagicMouseListener(JTable table) {
        this.table = table;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        row = table.rowAtPoint(e.getPoint());
    }

    public int getRow() {
        return row;
    }
}