package li.selman.picker.integer_input;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Hasan Kara
 */
public class IntegerInputView extends JPanel {

    private final JTextField textField = new JTextField();

    public IntegerInputView() {
        super();
        this.add(textField);
    }

    void setValue(int n) {
        textField.setText(Integer.toString(n));
    }

    Integer getValue() {
        return Integer.valueOf(textField.getText());
    }

    void setInputActionListener(ActionListener listener) {
        textField.addActionListener(listener);
    }
}
