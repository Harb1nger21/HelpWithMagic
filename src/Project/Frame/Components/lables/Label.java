package Project.Frame.Components.lables;

import static Project.utils.Sizes.*;
import static Project.utils.Sizes.START_Y;

public class Label extends AbstractLabel{
    private static int number;

    public Label(String name) {
        super(name);
    }

    @Override
    protected int getPointX() {
        return START_X + STEP * number++;
    }

    @Override
    protected int getPointY() {
        return START_Y + START_Y / 2;
    }
}
