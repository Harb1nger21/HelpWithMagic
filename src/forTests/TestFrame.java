package forTests;

import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame {

    public static void createGUI() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button1 = new JButton();
        ImageIcon icon1 = createIcon("icon1.png");
        button1.setIcon(icon1);
        panel.add(button1);


        JButton button2 = new JButton();
        ImageIcon icon2 = createIcon("icon2.png");
        button2.setIcon(icon2);
        panel.add(button2);

        JButton button3 = new JButton();
        ImageIcon icon3 = new ImageIcon("images/icon3.png");
        button3.setIcon(icon3);
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(390, 135));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    protected static ImageIcon createIcon(String path) {
        URL imgURL = TestFrame_2.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            createGUI();
        });
    }
}