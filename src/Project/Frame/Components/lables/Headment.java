package Project.Frame.Components.lables;

import javax.swing.*;

import java.awt.*;

import static Project.utils.Sizes.DESKTOP_WIDTH;

public class Headment extends JLabel{
    private Headment(){
        super("Конгресс Российской Ассоциации Иллюзионистов");
        super.setFont(new Font("Times New Roman", Font.BOLD, 30));
        super.setBounds((DESKTOP_WIDTH - 650) / 2, 20, 700, 20);
    }

    public static Headment getInstance(){
        return new Headment();
    }
}
