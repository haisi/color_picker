package li.selman.picker.model;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Hasan Kara
 */
public class ColorModel {

    private Color color = Color.BLACK;
    private final Set<ColorChangedListener> listeners = new HashSet<>();

    public synchronized void changeColor(Color color) {
        this.color = color;
        this.notifyColorChangedListeners(color);
    }

    public synchronized Color getColor() {
        return this.color;
    }

    public void registerColorChangedListener (ColorChangedListener listener) {
        this.listeners.add(listener);
    }
    public void unregisterColorChangedListener  (ColorChangedListener listener) {
        this.listeners.remove(listener);
    }

    private void notifyColorChangedListeners(Color color) {
        this.listeners.forEach(listener -> listener.colorChanged(color));
    }

}
