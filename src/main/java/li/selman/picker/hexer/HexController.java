package li.selman.picker.hexer;

import li.selman.picker.model.ColorChangedListener;
import li.selman.picker.model.ColorExtractor;

import java.awt.*;

/**
 * Because this is a read-only view (i.e. this component never changes the color), we don't need to inject the model.
 *
 * @author Hasan Kara
 */
public class HexController implements ColorChangedListener {

    private final HexView hexView;
    private final ColorExtractor colorExtractor;

    public HexController(HexView hexView, ColorExtractor colorExtractor) {
        this.hexView = hexView;
        this.colorExtractor = colorExtractor;
    }

    @Override
    public void colorChanged(Color color) {
        final int n = colorExtractor.getMyColor(color);
        final String hex = Integer.toString(n, 16).toUpperCase();

        hexView.setValue(hex);
    }
}
