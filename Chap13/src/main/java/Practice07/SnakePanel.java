package Practice07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SnakePanel extends JPanel implements Runnable {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    private int direction;
    private final Image img;
    private final Snake snake;

    public SnakePanel() {
        setLayout(null);
        snake = new Snake();
        snake.addIn(this);
        direction = LEFT;
        this.addKeyListener(new MyKeyListener());
        ImageIcon icon = new ImageIcon("images/bg.jpg");
        img = icon.getImage();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SnakePanel.this.requestFocus();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                snake.move(direction);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    direction = LEFT;
                    break;
                case KeyEvent.VK_RIGHT:
                    direction = RIGHT;
                    break;
                case KeyEvent.VK_UP:
                    direction = UP;
                    break;
                case KeyEvent.VK_DOWN:
                    direction = DOWN;
                    break;
            }
        }
    }
}
