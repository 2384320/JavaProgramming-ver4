package Practice05;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderEventFrame extends JFrame {
    private JSlider slider;
    private JLabel label;
    public SliderEventFrame() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        slider = new JSlider(100, 200);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.addChangeListener(new ChangeValueListener());
        c.add(slider);

        label = new JLabel("150");
        c.add(label);

        setSize(400, 200);
        setVisible(true);
    }

    class ChangeValueListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            label.setText(Integer.toString(slider.getValue()));
        }
    }
}
