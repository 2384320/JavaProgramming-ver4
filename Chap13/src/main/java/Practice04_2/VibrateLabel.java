package Practice04_2;

import Practice04_1.VibrateThread;

import javax.swing.*;
import java.awt.*;

public class VibrateLabel extends JFrame {
    VibrateLabel() {
        setTitle("진동하는 레이블 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        VibrateThread2 vibrateThread2 = new VibrateThread2();
        c.add(vibrateThread2);
        setSize(500, 500);
        setVisible(true);
    }
}
