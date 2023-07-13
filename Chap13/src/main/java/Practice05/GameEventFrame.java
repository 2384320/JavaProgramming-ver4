package Practice05;

import javax.swing.*;

public class GameEventFrame extends JFrame {
    GameEventFrame() {
        setTitle("사격 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();
        setContentPane(gamePanel);
        setResizable(false);
        setVisible(true);
        gamePanel.start();
    }
}
