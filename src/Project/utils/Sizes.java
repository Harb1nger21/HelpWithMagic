package Project.utils;

import java.awt.*;

public class Sizes {
    public static final Toolkit TOOLKIT = Toolkit.getDefaultToolkit();
    public static final Dimension DIMENSION = TOOLKIT.getScreenSize();
    public static final int DESKTOP_WIDTH = DIMENSION.width;
    public static final int DESKTOP_HEIGHT = DIMENSION.height;
    public static final int STEP = 170;
    public static final int BUTTON_WIDTH = 160;
    public static final int BUTTON_HEIGHT = 20;
    public static final int START_X = (DESKTOP_WIDTH - (STEP * 4 + BUTTON_WIDTH)) / 2;
    public static final int START_Y = 50;
}
