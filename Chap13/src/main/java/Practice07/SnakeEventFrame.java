package Practice07;

import javax.swing.*;

public class SnakeEventFrame extends JFrame {
    public SnakeEventFrame() {
        setTitle("스네이크 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakePanel snakePanel = new SnakePanel();
        setContentPane(snakePanel);
        setSize(400, 400);
        setVisible(true);

        snakePanel.setFocusable(true);
        snakePanel.requestFocus();

        Thread snakeThread = new Thread(snakePanel);
        snakeThread.start();
    }
}
