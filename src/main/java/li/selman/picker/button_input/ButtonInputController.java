package li.selman.picker.button_input;

import li.selman.picker.model.ColorModel;

/**
 * @author Hasan Kara
 */
public class ButtonInputController {

    private final ColorModel model;
    private final ButtonInputView view;

    public ButtonInputController(ColorModel model, ButtonInputView view) {
        this.model = model;
        this.view = view;

        this.view.addBrighterActionListener(e -> model.changeColor(this.model.getColor().brighter()));

        this.view.addDarkerActionListener(e -> model.changeColor(this.model.getColor().darker()));

    }
}
