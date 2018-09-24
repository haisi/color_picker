package li.selman.picker.integer_input;

import li.selman.picker.model.ColorChangedListener;
import li.selman.picker.model.ColorExtractor;
import li.selman.picker.model.ColorModel;
import li.selman.picker.model.SupportedColorChannels;

import java.awt.*;

/**
 * @author Hasan Kara
 */
public class IntegerInputController implements ColorChangedListener {

    private final ColorModel model;
    private final IntegerInputView view;
    private final ColorExtractor colorExtractor;
    private final SupportedColorChannels myColor;

    public IntegerInputController(ColorModel model, IntegerInputView integerInputView, ColorExtractor colorExtractor, SupportedColorChannels myColor) {
        this.model = model;
        this.view = integerInputView;
        this.colorExtractor = colorExtractor;
        this.myColor = myColor;

        this.view.setInputActionListener(e -> {
            final Color oldColor = model.getColor();

            int red = oldColor.getRed();
            int blue = oldColor.getBlue();
            int green = oldColor.getGreen();

            Integer newValue = view.getValue();

            switch (myColor) {
                case RED: red = newValue; break;
                case BLUE: blue = newValue; break;
                case GREEN: green = newValue; break;
            }

            model.changeColor(new Color(red, green, blue));
        });
    }

    @Override
    public void colorChanged(Color color) {
        final int n = colorExtractor.getMyColor(color);

        view.setValue(n);
    }
}
