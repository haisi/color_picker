package li.selman.picker;

import li.selman.picker.hexer.HexController;
import li.selman.picker.hexer.HexView;
import li.selman.picker.integer_input.IntegerInputController;
import li.selman.picker.integer_input.IntegerInputView;
import li.selman.picker.model.ColorModel;
import li.selman.picker.scroll_input.ScrollInputController;
import li.selman.picker.scroll_input.ScrollInputView;

import java.awt.Color;
import javax.swing.*;

import static li.selman.picker.model.SupportedColorChannels.*;

/**
 * @author Hasan Kara
 */
class MainPanel extends JPanel {

    MainPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        final ColorModel model = new ColorModel();

        addScrollInput(model);
        addHexView(model);
        addIntegerInput(model);

        model.changeColor(new Color(15, 0xBB, 255));

    }

    private void addScrollInput(ColorModel model) {
        ScrollInputView redView = new ScrollInputView();
        ScrollInputView blueView = new ScrollInputView();
        ScrollInputView greenView = new ScrollInputView();

        ScrollInputController redController = new ScrollInputController(model, redView, RED);
        ScrollInputController blueController = new ScrollInputController(model, blueView, BLUE);
        ScrollInputController greenController = new ScrollInputController(model, greenView, GREEN);

        this.add(redView);
        this.add(blueView);
        this.add(greenView);

        model.registerColorChangedListener(redController);
        model.registerColorChangedListener(blueController);
        model.registerColorChangedListener(greenController);
    }

    private void addIntegerInput(ColorModel model) {
        IntegerInputView redView = new IntegerInputView();
        IntegerInputView blueView = new IntegerInputView();
        IntegerInputView greenView = new IntegerInputView();

        IntegerInputController redController = new IntegerInputController(model, redView, RED);
        IntegerInputController blueController = new IntegerInputController(model, blueView, BLUE);
        IntegerInputController greenController = new IntegerInputController(model, greenView, GREEN);

        this.add(redView);
        this.add(blueView);
        this.add(greenView);

        model.registerColorChangedListener(redController);
        model.registerColorChangedListener(blueController);
        model.registerColorChangedListener(greenController);
    }

    private void addHexView(ColorModel model) {
        final HexView redHexView = new HexView();
        final HexView blueHexView = new HexView();
        final HexView greenHexView = new HexView();

        HexController redHexController = new HexController(redHexView, RED);
        HexController blueHexController = new HexController(blueHexView, BLUE);
        HexController greenHexController = new HexController(greenHexView, GREEN);

        this.add(redHexView);
        this.add(blueHexView);
        this.add(greenHexView);

        model.registerColorChangedListener(redHexController);
        model.registerColorChangedListener(blueHexController);
        model.registerColorChangedListener(greenHexController);
    }
}
