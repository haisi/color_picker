package li.selman.picker.canvas;

import li.selman.picker.model.ColorChangedListener;

import java.awt.*;

/**
 * @author Hasan Kara
 */
public class CanvasController implements ColorChangedListener {

    private final CanvasView view;

    public CanvasController(CanvasView view) {
        this.view = view;
    }

    @Override
    public void colorChanged(Color color) {
        this.view.setColor(color);
        this.view.repaint();
    }
}
