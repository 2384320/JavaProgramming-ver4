package Practice10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class TenClickEventFrame extends JFrame {
    private int count;
    private JLabel[] labels;
    private Container c;
    public TenClickEventFrame() {
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);

        labels = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            labels[i] = new JLabel(Integer.toString(i+1));
            labels[i].addMouseListener(new LabelClickListener());
        }

        settingLabel();
        setSize(400, 400);
        setVisible(true);
    }

    private void settingLabel() {
        count = 1;

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int x = r.nextInt(250) + 30;
            int y = r.nextInt(250) + 30;
            labels[i].setLocation(x, y);
            labels[i].setVisible(true);
            labels[i].setSize(20, 20);
            c.add(labels[i]);
        }
    }

    class LabelClickListener extends MouseAdapter {
        public void mouseReleased(MouseEvent e) {
            JLabel la = (JLabel) e.getSource();
            if (Integer.parseInt(la.getText()) == count) {
                count++;
                la.setVisible(false);
            }

            if (count == 11) settingLabel();
        }
    }
}
