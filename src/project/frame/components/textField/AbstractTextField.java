package project.frame.components.textField;

import javax.swing.*;

import static project.utils.Sizes.BUTTON_WIDTH;
import static project.utils.Sizes.BUTTON_HEIGHT;

public abstract class AbstractTextField extends JTextField {
    public AbstractTextField() {
        setBounds(getPointX(), getPointY(), BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    protected abstract int getPointX();

    protected abstract int getPointY();
}