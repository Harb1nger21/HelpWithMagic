package Project.Frame.Components.Buttons;

import static Project.utils.Sizes.*;

public abstract class AbstractChangeButton extends AbstractButton {
    private static int multiplier = 0;

    protected AbstractChangeButton(String name) {
        super(name);
    }

    protected int getPointX() {
        return START_X + STEP * 5;
    }

    protected int getPointY() {
        return START_Y * 3 + 30 * multiplier++;
    }

}
