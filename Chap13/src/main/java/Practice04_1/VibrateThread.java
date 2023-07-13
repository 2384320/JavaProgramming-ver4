package Practice04_1;

import javax.swing.*;

public class VibrateThread extends Thread {
    JFrame jFrame;
    int x = 300;
    public VibrateThread(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    public void run() {
        while (true) {
            if (x == 300) x += 3;
            else x -= 3;
            jFrame.setLocation(x, 500);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
