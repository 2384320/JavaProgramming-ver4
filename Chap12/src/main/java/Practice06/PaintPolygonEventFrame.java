package Practice06;

import javax.swing.*;
import java.awt.*;

public class PaintPolygonEventFrame extends JFrame {
    public PaintPolygonEventFrame() {
        setTitle("그래픽 다각형 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        setContentPane(panel);
        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int[] x = new int[] {this.getWidth() / 2, 0, this.getWidth() / 2, this.getWidth()};
            int[] y = new int[] {0, this.getHeight() / 2, this.getHeight(), this.getHeight() / 2};

            for (int i = 1; i <= 10; i++) {
                x[1] += 15;
                x[3] -= 15;
                y[0] += 15;
                y[2] -= 15;
                g.drawPolygon(x, y, 4);
            }
        }
    }
}
