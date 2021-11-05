package Project.Frame.Components.lables;

import javax.swing.*;

import java.awt.*;

import static Project.utils.Sizes.*;

public class Category extends JLabel {
    private Category() {
        super();
        setBounds(START_X + STEP * 2, START_Y * 2 + START_Y / 2, 500, 20);
        setFont(new Font("Times New Roman", Font.BOLD, 20));
    }

    public static Category getInstance() {
        return new Category();
    }
}
