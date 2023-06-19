package Practice04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class GraphicsImageDragEventFrame extends JFrame {
    private MyPanel panel;
    public GraphicsImageDragEventFrame() {
        setTitle("그래픽 이미지 출력 및 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new MyPanel();
        setContentPane(panel);
        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/2.jpg");
        private Image image = icon.getImage();
        private int width = image.getWidth(this);
        private int height = image.getHeight(this);
        private int x = 0;
        private int y = 0;

        public MyPanel() {
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    Point p = e.getPoint();
                    x = (int)p.getX();
                    y = (int)p.getY();
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, x, y, width, height, this);
        }
    }
}
