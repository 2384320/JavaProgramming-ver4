package Practice10;

import javax.swing.*;
import java.awt.*;

public class QuarterEventFrame extends JFrame {
    private ImageIcon icon = new ImageIcon("images/1.jpg");
    private Image image = icon.getImage();
    public QuarterEventFrame() {
        setTitle("그래픽 이미지 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        setContentPane(panel);
        setSize(image.getWidth(null), image.getHeight(null));
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth() / 2 - 5, getHeight() / 2 - 5, 0, 0, getWidth() / 2 - 5, getHeight() / 2 - 5, this);
            g.drawImage(image, 0, getHeight() / 2 + 5, getWidth() / 2 - 5, getHeight(), 0, getHeight() / 2 + 5, getWidth() / 2 - 5, getHeight(), this);
            g.drawImage(image, getWidth() / 2 + 5, 0, getWidth(), getHeight() / 2 - 5, getWidth() / 2 + 5, 0, getWidth(), getHeight() / 2 - 5, this);
            g.drawImage(image, getWidth() / 2 + 5, getHeight() / 2 + 5, getWidth(), getHeight(), getWidth() / 2 + 5, getHeight() / 2 + 5, getWidth(), getHeight(), this);
        }
    }
}
