package li.selman.picker.scroll_input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentListener;

/**
 * @author Hasan Kara
 */
public class ScrollInputView extends JPanel {

    private final JScrollBar scrollBar = new JScrollBar(Adjustable.HORIZONTAL, 0, 1, 0, 256);

    public ScrollInputView() {
        super();
        scrollBar.setSize(300, 20);
        this.add(scrollBar);
    }

    void setInputActionListener(AdjustmentListener adjustmentListener) {
        scrollBar.addAdjustmentListener(adjustmentListener);
    }

    void setScrollBarColor(Color color) {
        scrollBar.setBackground(color);
    }

    void setValue(int n) {
        scrollBar.setValue(n);
    }

    Integer getValue() {
        return scrollBar.getValue();
    }
}
