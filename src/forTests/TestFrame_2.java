package forTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TestFrame_2 extends JFrame {

    private JLabel eventLabel;

    public TestFrame_2() {
        super("Test frame");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel();

        JButton button1 = new JButton("Button 1");
        button1.setPreferredSize(new Dimension(150, 80));
        buttonsPanel.add(button1);

        button1.addMouseListener(new CustomListener());

        mainPanel.add(buttonsPanel, BorderLayout.NORTH);

        eventLabel = new JLabel();
        eventLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(eventLabel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
    }

    public static JLabel createEmptyLabel() {
        JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(100, 35));
        return label;
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JFrame frame = new TestFrame_2();
            frame.setPreferredSize(new Dimension(330, 160));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public class CustomListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            String text = "<html><b>" + button.getText()
                    + " mouseReleased() <br>" + button.getText()
                    + " mouseClicked() </b><html>";
            eventLabel.setText(text);
        }

        public void mouseEntered(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            eventLabel.setText(button.getText() + " mouseEntered()");
        }

        public void mouseExited(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            eventLabel.setText(button.getText() + " mouseExited()");
        }

        public void mousePressed(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            eventLabel.setText(button.getText() + " mousePressed()");
        }

        public void mouseReleased(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            eventLabel.setText(button.getText() + " mouseReleased()");
        }
    }
}