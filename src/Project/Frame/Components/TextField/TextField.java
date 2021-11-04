package Project.Frame.Components.TextField;

import Project.Frame.Components.Buttons.AddButton;

import static Project.utils.Sizes.*;

public class TextField extends AbstractTextField{
    private static int number;
    public TextField(){
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
