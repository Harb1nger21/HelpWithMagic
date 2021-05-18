package forTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JTableExample {

    Object[] headers = {"Name", "Surname", "Telephone"};

    Object[][] data = {
            {"John", "Smith", "1112221"},
            {"Ivan", "Black", "2223334"},
            {"George", "White", "3334445"},
            {"Bolvan", "Black", "4445556"},
            {"Serg", "Black", "5556667"},
            {"Pussy", "Black", "6667778"},
            {"Tonya", "Red", "7778889"},
            {"Elise", "Green", "8889990"}
    };

    JTable jTabPeople;

    JTableExample() {
        JFrame jfrm = new JFrame("JTableExample");

        jfrm.getContentPane().setLayout(new FlowLayout());

        jfrm.setSize(300, 170);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("John", "Smith", "1112221"));
        humans.add(new Human("Ivan", "Black", "2223334"));
        humans.add(new Human("George", "White", "3334445"));

        MyTableModel tmodel = new MyTableModel(humans);
        jTabPeople = new JTable(tmodel);

        JScrollPane jscrlp = new JScrollPane(jTabPeople);

        jfrm.setSize(500, 170);
        jTabPeople.setPreferredScrollableViewportSize(new Dimension(200, 100));

        jfrm.getContentPane().add(jscrlp);

        JButton btnPress = new JButton("Clickk!");
        btnPress.addActionListener(e -> {
            humans.add(new Human("Pussy", "Black", "6667778"));
            tmodel.fireTableDataChanged();
        });
        jfrm.add(btnPress);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTableExample::new);
    }
}
