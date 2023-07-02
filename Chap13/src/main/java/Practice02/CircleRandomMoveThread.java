package Practice02;

import Practice02.CircleRandomMoveEventFrame.MyPanel;

public class CircleRandomMoveThread extends Thread {
    MyPanel panel;
    public CircleRandomMoveThread(MyPanel panel) {
         this.panel = panel;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(500);
                panel.repaint();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
