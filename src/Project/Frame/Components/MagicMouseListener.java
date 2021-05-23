package Project.Frame.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MagicMouseListener extends MouseAdapter {
    private JTable table;
    private Point point;
    private int row;
    private int column;

    public MagicMouseListener(JTable table) {
        this.table = table;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        point = e.getPoint();
        row = table.rowAtPoint(point);
        column = table.columnAtPoint(point);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Point getPoint() {
        return point;
    }
}
