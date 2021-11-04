package Project.Frame.Components.Buttons;

import javax.swing.*;

import static Project.utils.Sizes.BUTTON_HEIGHT;
import static Project.utils.Sizes.BUTTON_WIDTH;

public abstract class AbstractButton extends JButton {

    protected AbstractButton(String name) {
        super(name);
        setBounds(getPointX(), getPointY(), BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    protected abstract int getPointX();

    protected abstract int getPointY();
}
