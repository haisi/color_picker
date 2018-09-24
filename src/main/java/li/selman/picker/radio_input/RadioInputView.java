package li.selman.picker.radio_input;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;

import static java.awt.Color.*;

/**
 * @author Hasan Kara
 */
public class RadioInputView extends JPanel {

    private List<String> colorNames = List.of("red", "blue", "green", "yellow", "cyan", "orange", "black");
    private List<Color> colors = List.of(RED, BLUE, GREEN, YELLOW, CYAN, ORANGE, BLACK);
    private final List<JRadioButton> radioButtons;

    public RadioInputView() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        radioButtons = colorNames.stream().map(JRadioButton::new).collect(Collectors.toList());

        ButtonGroup group = new ButtonGroup();
        radioButtons.forEach(group::add);

        radioButtons.forEach(this::add);

    }

    void selectButton(Color color) {
        int idx = colors.indexOf(color);
        radioButtons.get(idx).setSelected(true);
    }
}
