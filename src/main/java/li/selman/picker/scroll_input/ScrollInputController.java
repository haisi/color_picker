package li.selman.picker.scroll_input;

import li.selman.picker.model.ColorChangedListener;
import li.selman.picker.model.ColorModel;
import li.selman.picker.model.SupportedColorChannels;

import java.awt.*;

/**
 * @author Hasan Kara
 */
public class ScrollInputController implements ColorChangedListener {

    private final ColorModel model;
    private final ScrollInputView view;
    private final SupportedColorChannels myColor;

    public ScrollInputController(ColorModel model, ScrollInputView view, SupportedColorChannels myColor) {
        this.model = model;
        this.view = view;
        this.myColor = myColor;

        this.view.setScrollBarColor(myColor.getColor());
        this.view.setInputActionListener(e -> {
            final Color oldColor = model.getColor();
            Integer newValue = view.getValue();

            Color newColor = myColor.createNewColor(oldColor, newValue);

            this.model.changeColor(newColor);
        });
    }

    @Override
    public void colorChanged(Color color) {
        final int n = myColor.getMyColor(color);
        view.setValue(n);
    }
}
