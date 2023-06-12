package Practice03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.VK_LEFT;

public class LeftKeyEventFrame extends JFrame {
    public LeftKeyEventFrame() {
        super("Left 키로 문자열 교체");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        StringBuffer sb = new StringBuffer("Love Java");
        JLabel label = new JLabel(sb.toString());
        c.add(label);

        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                JLabel la = (JLabel)e.getSource();
                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                    la.setText(sb.reverse().toString());
            }
        });

        label.setFocusable(true);
        label.requestFocus();
    }
}
