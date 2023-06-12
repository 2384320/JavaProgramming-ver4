package Practice05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FontSizePlusMinusEventFrame extends JFrame {
    public FontSizePlusMinusEventFrame() {
        super("+, - 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(label);

        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Font f = label.getFont();
                int size = f.getSize();
                if (e.getKeyChar() == '+') label.setFont(new Font("Arial", Font.PLAIN, size + 5));
                else if (e.getKeyChar() == '-') {
                    if (size - 5 < 5) return;
                    label.setFont(new Font("Arial", Font.PLAIN, size - 5));
                }
            }
        });

        label.setFocusable(true);
        label.requestFocus();
    }
}
