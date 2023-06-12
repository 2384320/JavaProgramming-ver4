package Practice04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LeftKeySpinEventFrame extends JFrame {
    public LeftKeySpinEventFrame() {
        super("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        String str = "Love Java";
        JLabel label = new JLabel(str);
        c.add(label);

        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                JLabel la = (JLabel)e.getSource();
                String str = la.getText();
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    str = str.substring(1) + str.substring(0, 1);
                    la.setText(str);
                }
            }
        });

        label.setFocusable(true);
        label.requestFocus();
    }
}
