package Practice02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleRandomMoveEventFrame extends JFrame {
    public CircleRandomMoveEventFrame() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        CircleRandomMoveThread th = new CircleRandomMoveThread(panel);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                th.start();
            }
        });
        setContentPane(panel);
        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval((int) (Math.random() * 180), (int) (Math.random() * 180), 50, 50);
        }
    }
}
