package Practice04_1;

import javax.swing.*;

public class VibrateFrame extends JFrame {
    VibrateFrame() {
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VibrateThread thread = new VibrateThread(this);
        thread.start();
        setSize(400, 400);
        setVisible(true);
    }
}
