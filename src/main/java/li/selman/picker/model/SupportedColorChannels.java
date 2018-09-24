package li.selman.picker.model;

import java.awt.*;
import java.util.function.Function;

/**
 * @author Hasan Kara
 */
public enum SupportedColorChannels {

    RED(Color.red, Color::getRed), GREEN(Color.green, Color::getGreen), BLUE(Color.blue, Color::getBlue);

    private final Color color;
    private final Function<Color, Integer> colorExtractor;

    SupportedColorChannels(Color color, Function<Color, Integer> colorExtractor) {
        this.color = color;
        this.colorExtractor = colorExtractor;
    }

    /**
     *
     * @param color to extract channel from
     * @return the value of my color-channel
     */
    public Integer getMyColor(Color color) {
        return colorExtractor.apply(color);
    }
}
