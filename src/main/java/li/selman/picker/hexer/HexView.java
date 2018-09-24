package li.selman.picker.hexer;

import javax.swing.*;

/**
 * @author Hasan Kara
 */
public class HexView extends JPanel {

    private final JLabel valueLabel;
    private final String defaultValue = "00";

    public HexView() {
        super();
        this.valueLabel = new JLabel(defaultValue);
        this.add(valueLabel);
    }

    void setValue(String hex) {
        valueLabel.setText(hex);
    }

}
