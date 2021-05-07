package forTests;

import javax.swing.*;
import java.awt.*;

public class notHelloWorld {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }

    static class NotHelloWorldFrame extends JFrame {

        public NotHelloWorldFrame() {
            add(new NotHelloWorldComponent());
            pack();
        }
    }

    static class NotHelloWorldComponent extends JComponent{
        public static final int MESSAGE_X = 75;
        public static final int MESSAGE_Y = 100;

        private static final int DEFAULT_WIDTH = 300;
        private static final int DEFAULT_HEIGHT = 200;

        public void paintComponent(Graphics g){
            g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
        }

        public Dimension getPreferredSize(){
            return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }
    }
}
