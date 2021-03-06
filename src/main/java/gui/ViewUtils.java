package main.java.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Marek Bruchatý
 * Date: 06/04/16.
 */

public class ViewUtils {

    /**
     * Returns Point that represents the center of the current window
     * @param jPanel Currently active JPanel
     * */
    public static Point getCurrentWindowCenter(JPanel jPanel) {
        GraphicsDevice screen = MouseInfo.getPointerInfo().getDevice();
        Rectangle r = screen.getDefaultConfiguration().getBounds();
        int x = (r.width / 2 - jPanel.getWidth() / 2) / 2 + r.x;
        int y = (r.height / 2 - jPanel.getHeight() / 2) / 2 + r.y;
        return new Point(x, y);
    }

}
