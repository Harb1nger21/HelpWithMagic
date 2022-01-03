package project.frame.components.lables;

import javax.swing.*;

import static project.utils.Sizes.BUTTON_HEIGHT;
import static project.utils.Sizes.BUTTON_WIDTH;

public abstract class AbstractLabel extends JLabel {
    public AbstractLabel(String name) {
        super(name);
        setBounds(getPointX(), getPointY(), BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    protected abstract int getPointX();

    protected abstract int getPointY();
}
