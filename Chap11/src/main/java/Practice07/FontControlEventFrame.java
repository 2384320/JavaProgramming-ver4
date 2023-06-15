package Practice07;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class FontControlEventFrame extends JFrame {
    private JSlider slider;
    private JLabel label;
    public FontControlEventFrame() {
        setTitle("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        slider = new JSlider(1, 100);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new FontControlListener());
        c.add(BorderLayout.NORTH, slider);

        label = new JLabel("I Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, slider.getValue()));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        c.add(BorderLayout.CENTER, label);

        setSize(600, 300);
        setVisible(true);
    }

    class FontControlListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider s = (JSlider) e.getSource();
            int size = s.getValue();
            label.setFont(new Font("Arial", Font.PLAIN, size));
        }
    }
}
