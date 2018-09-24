package li.selman.picker.canvas;

import javax.swing.*;
import java.awt.*;

/**
 * @author Hasan Kara
 */
public class CanvasView extends JPanel {

    private Color color = Color.GREEN;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0,0,100,100);
        g.setColor(color);
        g.fillRect(0,0,100,100);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100); // appropriate constants
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
