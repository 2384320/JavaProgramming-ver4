package Practice05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ImageEventFrame extends JFrame {
    private int width, height;
    public ImageEventFrame() {
        setTitle("그래픽 이미지 확대 축소 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        width = 50;
        height = 50;

        MyPanel panel = new MyPanel();
        setContentPane(panel);
        setSize(400, 400);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/1.jpg");
        private Image image = icon.getImage();

        public MyPanel() {
            setFocusable(true);
            requestFocus();

            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    super.keyPressed(e);
                    System.out.println(e.getKeyChar());
                    if (e.getKeyChar() == '+') {
                        width += getWidth() / 10;
                        height += getHeight() / 10;
                    } else if (e.getKeyChar() == '-') {
                        width -= getWidth() / 10;
                        height -= getHeight() / 10;
                    }
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 10, 10, width, height, this);
        }
    }
}
