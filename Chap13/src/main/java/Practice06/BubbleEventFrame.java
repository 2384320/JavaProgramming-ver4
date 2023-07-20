package Practice06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BubbleEventFrame extends JFrame {
    BubbleEventFrame() {
        setTitle("버블 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                BubbleThread bubbleThread = new BubbleThread(c, e);
                bubbleThread.start();
            }
        });

        setSize(300, 300);
        setVisible(true);
    }
}
