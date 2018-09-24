package li.selman.picker.radio_input;

import li.selman.picker.model.ColorChangedListener;
import li.selman.picker.model.ColorModel;

import java.awt.Color;
import java.util.List;

import static java.awt.Color.*;

/**
 * @author Hasan Kara
 */
public class RadioInputController implements ColorChangedListener {

    private final ColorModel model;
    private final RadioInputView view;

    private List<Color> colors = List.of(RED, BLUE, GREEN, YELLOW, CYAN, ORANGE, BLACK);

    public RadioInputController(ColorModel model, RadioInputView view) {
        this.model = model;
        this.view = view;

        this.view.addListeners(color -> {
            model.changeColor(color);
            return null;
        });
    }

    @Override
    public void colorChanged(Color color) {
        if (colors.contains(color)) {
            view.selectButton(color);
        }
    }
}
