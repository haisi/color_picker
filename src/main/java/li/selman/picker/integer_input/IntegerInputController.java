package li.selman.picker.integer_input;

import li.selman.picker.model.ColorChangedListener;
import li.selman.picker.model.ColorModel;
import li.selman.picker.model.SupportedColorChannels;

import java.awt.*;

/**
 * @author Hasan Kara
 */
public class IntegerInputController implements ColorChangedListener {

    private final ColorModel model;
    private final IntegerInputView view;
    private final SupportedColorChannels myColor;

    public IntegerInputController(ColorModel model, IntegerInputView integerInputView, SupportedColorChannels myColor) {
        this.model = model;
        this.view = integerInputView;
        this.myColor = myColor;

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
