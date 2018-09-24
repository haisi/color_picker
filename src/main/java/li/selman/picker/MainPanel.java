package li.selman.picker;

import li.selman.picker.hexer.HexController;
import li.selman.picker.hexer.HexView;
import li.selman.picker.integer_input.IntegerInputController;
import li.selman.picker.integer_input.IntegerInputView;
import li.selman.picker.model.ColorExtractor;
import li.selman.picker.model.ColorModel;
import li.selman.picker.model.SupportedColorChannels;

import java.awt.Color;
import javax.swing.*;

/**
 * @author Hasan Kara
 */
class MainPanel extends JPanel {

    MainPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        final ColorModel model = new ColorModel();

        final ColorExtractor redExtractor = Color::getRed;
        final ColorExtractor blueExtractor = Color::getBlue;
        final ColorExtractor greenExtractor = Color::getGreen;

        addHexView(model, redExtractor, blueExtractor, greenExtractor);
        addIntegerInput(model, redExtractor, blueExtractor, greenExtractor);

        model.changeColor(new Color(15, 0xBB, 255));

    }

    private void addIntegerInput(ColorModel model, ColorExtractor redExtractor, ColorExtractor blueExtractor, ColorExtractor greenExtractor) {
        IntegerInputView redView = new IntegerInputView();
        IntegerInputView blueView = new IntegerInputView();
        IntegerInputView greenView = new IntegerInputView();

        IntegerInputController redController = new IntegerInputController(model, redView, redExtractor, SupportedColorChannels.RED);
        IntegerInputController blueController = new IntegerInputController(model, blueView, blueExtractor, SupportedColorChannels.BLUE);
        IntegerInputController greenController = new IntegerInputController(model, greenView, greenExtractor, SupportedColorChannels.GREEN);

        this.add(redView);
        this.add(blueView);
        this.add(greenView);

        model.registerColorChangedListener(redController);
        model.registerColorChangedListener(blueController);
        model.registerColorChangedListener(greenController);
    }

    private void addHexView(ColorModel model, ColorExtractor redExtractor, ColorExtractor blueExtractor, ColorExtractor greenExtractor) {
        final HexView redHexView = new HexView();
        final HexView blueHexView = new HexView();
        final HexView greenHexView = new HexView();

        HexController redHexController = new HexController(redHexView, redExtractor);
        HexController blueHexController = new HexController(blueHexView, blueExtractor);
        HexController greenHexController = new HexController(greenHexView, greenExtractor);

        this.add(redHexView);
        this.add(blueHexView);
        this.add(greenHexView);

        model.registerColorChangedListener(redHexController);
        model.registerColorChangedListener(blueHexController);
        model.registerColorChangedListener(greenHexController);
    }
}
