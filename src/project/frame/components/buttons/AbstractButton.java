package project.frame.components.buttons;

import javax.swing.*;

import static project.utils.Sizes.BUTTON_HEIGHT;
import static project.utils.Sizes.BUTTON_WIDTH;

public abstract class AbstractButton extends JButton {

    protected AbstractButton(String name) {
        super(name);
        setBounds(getPointX(), getPointY(), BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    protected abstract int getPointX();

    protected abstract int getPointY();
}