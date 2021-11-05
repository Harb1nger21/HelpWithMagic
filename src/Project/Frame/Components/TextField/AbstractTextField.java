package Project.Frame.Components.TextField;

import javax.swing.*;

import static Project.utils.Sizes.BUTTON_WIDTH;
import static Project.utils.Sizes.BUTTON_HEIGHT;

public abstract class AbstractTextField extends JTextField {
    public AbstractTextField() {
        setBounds(getPointX(), getPointY(), BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    protected abstract int getPointX();

    protected abstract int getPointY();
}