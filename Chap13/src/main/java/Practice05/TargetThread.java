package Practice05;

import javax.swing.*;

public class TargetThread extends Thread {
    int x = 0;
    JComponent target;
    GamePanel gamePanel;

    TargetThread(JComponent target, GamePanel gamePanel) {
        this.target = target;
        this.gamePanel = gamePanel;
        target.setLocation(0, 0);
        target.getParent().repaint();
    }

    @Override
    public void run() {
        while (true) {
            int x = target.getX() + 5;
            int y = target.getY();
            if (x > gamePanel.getWidth()) target.setLocation(0, 0);
            else target.setLocation(x, y);

            target.getParent().repaint();
            try {
                sleep(20);
            } catch (InterruptedException e) {
                target.setLocation(0, 0);
                target.getParent().repaint();
                try {
                    sleep(500);
                } catch (InterruptedException e2) {
                }
            }
        }
    }
}
