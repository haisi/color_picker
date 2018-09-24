package li.selman.picker.button_input;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Hasan Kara
 */
public class ButtonInputView extends JPanel {

    private final JButton brighterButton = new JButton("Brighter");
    private final JButton darkerButton = new JButton("Darker");

    public ButtonInputView() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(brighterButton);
        this.add(darkerButton);
    }

    void addBrighterActionListener(ActionListener listener) {
        this.brighterButton.addActionListener(listener);
    }

    void addDarkerActionListener(ActionListener listener) {
        this.darkerButton.addActionListener(listener);
    }
}
