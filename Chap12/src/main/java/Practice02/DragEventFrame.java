package Practice02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragEventFrame extends JFrame {
    private MyPanel panel;
    public DragEventFrame() {
        setTitle("이미지 위에 원 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new MyPanel();
        setContentPane(panel);

        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/1.jpg");
        private Image image = icon.getImage();
        private Point point = new Point(50, 50);
        public MyPanel() {
            this.addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    point = e.getPoint();
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
            g.setColor(Color.GREEN);
            g.fillOval((int) point.getX(), (int) point.getY(), 40, 40);
        }
    }
}
