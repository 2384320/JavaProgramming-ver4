package Practice07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelEventFrame extends JFrame {
    public MouseWheelEventFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(label);

        label.addMouseWheelListener(e -> {
            int n = e.getWheelRotation();
            Font f = label.getFont();
            int size = f.getSize();
            if (n < 0) {
                if (size - 1 < 5) return;
                label.setFont(new Font("Arial", Font.PLAIN, size - 5));
            } else label.setFont(new Font("Arial", Font.PLAIN, size + 5));
        });

        label.setFocusable(true);
        label.requestFocus();
    }
}
