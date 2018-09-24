package li.selman.picker.model;

import java.awt.*;

/**
 * @author Hasan Kara
 */
public enum SupportedColorChannels {

    RED(Color.red), GREEN(Color.green), BLUE(Color.blue);

    private final Color color;

    SupportedColorChannels(Color color) {
        this.color = color;
    }
}
