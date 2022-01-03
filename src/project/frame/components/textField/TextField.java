package project.frame.components.textField;

import static project.utils.Sizes.*;

public class TextField extends AbstractTextField {
    private static int number;

    public TextField() {
    }

    @Override
    protected int getPointX() {
        return START_X + STEP * number++;
    }

    @Override
    protected int getPointY() {
        return START_Y * 2;
    }
}