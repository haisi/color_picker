package li.selman.picker;

import li.selman.picker.hexer.HexController;
import li.selman.picker.hexer.HexView;
import li.selman.picker.model.ColorExtractor;
import li.selman.picker.model.ColorModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Hasan Kara
 */
class MainPanel extends JPanel {

    MainPanel() {
        super(new BorderLayout());

        final ColorModel model = new ColorModel();

        final ColorExtractor redExtractor = Color::getRed;
        final ColorExtractor blueExtractor = Color::getBlue;
        final ColorExtractor greenExtractor = Color::getGreen;

        final HexView redHexView = new HexView();
        final HexView blueHexView = new HexView();
        final HexView greenHexView = new HexView();

        HexController redHexController = new HexController(redHexView, redExtractor);
        HexController blueHexController = new HexController(blueHexView, blueExtractor);
        HexController greenHexController = new HexController(greenHexView, greenExtractor);

        this.add(redHexView, BorderLayout.NORTH);
        this.add(blueHexView, BorderLayout.CENTER);
        this.add(greenHexView, BorderLayout.SOUTH);

        model.registerColorChangedListener(redHexController);
        model.registerColorChangedListener(blueHexController);
        model.registerColorChangedListener(greenHexController);

        model.changeColor(new Color(15, 0xBB, 255));

    }
}
