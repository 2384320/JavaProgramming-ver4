package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class ClippingEventFrame extends JFrame {
    private ImageIcon icon = new ImageIcon("images/1.jpg");
    private Image image = icon.getImage();
    private int clipX = 0;
    private int clipY = 0;
    public ClippingEventFrame() {
        setTitle("Open Challenge 12");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_UP && clipY > 0) clipY -= 10;
                else if (e.getKeyCode() == KeyEvent.VK_DOWN && clipY + 50 < getHeight()) clipY += 10;
                else if (e.getKeyCode() == KeyEvent.VK_LEFT && clipX > 0) clipX -= 10;
                else if (e.getKeyCode() == KeyEvent.VK_RIGHT && clipX + 50 < getWidth()) clipX += 10;

                repaint();
            }
        });
        panel.setFocusable(true);
        setContentPane(panel);
        setSize(image.getWidth(null), image.getHeight(null));
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setClip(clipX, clipY, 50, 50);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }

    }
}
