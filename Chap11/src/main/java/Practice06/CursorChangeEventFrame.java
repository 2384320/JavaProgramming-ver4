package Practice06;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CursorChangeEventFrame extends JFrame {
    private JSlider slider;
    private JTextArea textArea;
    public CursorChangeEventFrame() {
        setTitle("TextArea Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        textArea = new JTextArea(7, 20);
        textArea.addKeyListener(new CursorListener());
        c.add(textArea);

        slider = new JSlider(0, 100);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.addChangeListener(new SliderChangeListener());
        slider.setValue(0);
        c.add(slider);

        setSize(400, 250);
        setVisible(true);
    }

    class CursorListener extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            JTextArea ta = (JTextArea) e.getSource();
            String str = ta.getText();
            if (str.length() <= 100) slider.setValue(str.length());
            else {
                str = str.substring(0, 99);
                ta.setText(str);
            }
        }
    }

    class SliderChangeListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider s = (JSlider) e.getSource();
            String str = textArea.getText();
            int textLength = str.length();

            if (textLength > s.getValue()) {
                str = str.substring(0, s.getValue());
                textArea.setText(str);
            } else s.setValue(textLength);
        }
    }
}
