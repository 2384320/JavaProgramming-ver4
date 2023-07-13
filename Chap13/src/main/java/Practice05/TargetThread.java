package Practice05;

import javax.swing.*;

public class TargetThread extends Thread {
    int x = 0;
    JLabel jLabel;
    TargetThread(JLabel jLabel) {
        this.jLabel = jLabel;
    }

    @Override
    public void run() {
        while (true) {
            jLabel.setLocation(jLabel.getX() + 5, 0);
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (jLabel.getX() > )
        }
    }
}
