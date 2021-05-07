package Project;

import javax.swing.*;
import java.awt.*;

public class CloseFrame extends JFrame {

    public CloseFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int desktopWidth = dimension.width;
        int desktopHeight = dimension.height;

        setBounds(desktopWidth / 3, desktopHeight / 3, 100, 50);
        add(new TitleText("Подтвердите закрытие", 30));


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CloseFrame();
    }
}
