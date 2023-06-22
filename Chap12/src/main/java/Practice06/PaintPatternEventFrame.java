package Practice06;

import javax.swing.*;
import java.awt.*;

public class PaintPatternEventFrame extends JFrame {
    public PaintPatternEventFrame() {
        setTitle("격자 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        setContentPane(panel);
        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int x = this.getWidth() / 10;
            int y = this.getHeight() / 10;
            for (int i = 1; i < 10; i++) {
                g.drawLine(0, y * i, x * 10, y * i);
                g.drawLine(x * i, 0, x * i, y * 10);
            }
        }
    }
}
