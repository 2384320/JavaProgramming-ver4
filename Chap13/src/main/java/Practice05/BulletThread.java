package Practice05;

import javax.swing.*;

public class BulletThread extends Thread {
    private JComponent bullet, target;
    private Thread targetThread;

    public BulletThread(JComponent bullet, JComponent target, Thread targetThread) {
        this.bullet = bullet;
        this.target = target;
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while (true) {
            // 명중하였는지 확인
            if (hit()) {
                targetThread.interrupt();
                bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 50);
                return;
            } else {
                int x = bullet.getX();
                int y = bullet.getY() - 5;
                if (y < 0) {
                    bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 50);
                    bullet.getParent().repaint();
                    return; // thread ends
                }
                bullet.setLocation(x, y);
                bullet.getParent().repaint();
            }
            try {
                sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean hit() {
        if (targetContains(bullet.getX(), bullet.getY()) ||
                targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY()) ||
                targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY() + bullet.getHeight() - 1) ||
                targetContains(bullet.getX(), bullet.getY() + bullet.getHeight() - 1))
            return true;
        else
            return false;
    }

    private boolean targetContains(int x, int y) {
        if (((target.getX() <= x) && (target.getX() + target.getWidth() - 1 >= x)) &&
                ((target.getY() <= y) && (target.getY() + target.getHeight() - 1 >= y))) {
            return true;
        } else
            return false;

    }
}
