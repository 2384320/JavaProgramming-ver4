package Practice07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPolygonEventFrame extends JFrame {
    private int[] x, y, preX, preY;
    private int count;
    public DrawPolygonEventFrame() {
        setTitle("마우스로 페다각형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        count = 0;
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                count++;
                x = new int[count];
                y = new int[count];

                for (int i = 0; i < count - 1; i++) {
                    x[i] = preX[i];
                    y[i] = preY[i];
                }

                x[count-1] = e.getX();
                y[count-1] = e.getY();

                preX = x;
                preY = y;

                repaint();
            }
        });
        setContentPane(panel);
        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (count > 0) g.drawPolygon(x, y, count);
        }
    }
}
