package Project.Frame.Components.Buttons;

import Project.Frame.Components.Table.TableModel;

import static Project.utils.Sizes.*;

public abstract class AbstractChangeButton extends AbstractButton {
    protected final TableModel table = TableModel.getInstance();
    private static int multiplier = 0;

    protected AbstractChangeButton(String name) {
        super(name);
    }

    @Override
    protected int getPointX() {
        return START_X + STEP * 5;
    }

    @Override
    protected int getPointY() {
        return START_Y * 3 + 35 * multiplier++;
    }

}