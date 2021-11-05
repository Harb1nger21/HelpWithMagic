package Project.Frame.Components.Lables;

import javax.swing.*;

import static Project.utils.Sizes.BUTTON_HEIGHT;
import static Project.utils.Sizes.BUTTON_WIDTH;

public abstract class AbstractLabel extends JLabel {
    public AbstractLabel(String name) {
        super(name);
        setBounds(getPointX(), getPointY(), BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    protected abstract int getPointX();

    protected abstract int getPointY();
}
