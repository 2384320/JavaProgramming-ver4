package Practice06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class BubbleThread extends Thread {
    int x, y;
    ImageIcon img = new ImageIcon("img/target.jpg");
    JLabel label = new JLabel(img);

    Container c;
    public BubbleThread(Container c, MouseEvent e) {
        x = e.getX();
        y = e.getY();
        this.c = c;
        label.setLocation(x, y);
        label.setSize(30, 30);
        c.add(label);
        c.repaint();
    }

    public void run() {
        while (true) {
            try {
                y -= 5;
                label.setLocation(x, y);
                if (label.getY() + label.getHeight() < 0) return;
                c.repaint();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
