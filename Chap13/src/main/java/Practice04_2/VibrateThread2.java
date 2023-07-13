package Practice04_2;

import javax.swing.*;
import java.awt.*;

public class VibrateThread2 extends JLabel implements Runnable {
    int x = 200;

    public VibrateThread2() {
        setText("vibrate label");
        setLocation(200, 200);
        setFont(new Font("Arial", Font.PLAIN, 20));
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        while (true) {
            if (x == 200) x += 3;
            else x -= 3;
            this.setLocation(x, 200);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
