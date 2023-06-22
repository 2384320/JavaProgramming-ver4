package Practice09;

import javax.swing.*;
import java.awt.*;

public class BlueLabelEventFrame extends JFrame {
    public BlueLabelEventFrame() {
        setTitle("Blue Label 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        BlueLabel label1 = new BlueLabel("hello");
        label1.setFont(new Font("Arial", Font.PLAIN, 10));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);
        c.add(label1);

        BlueLabel label2 = new BlueLabel("Big Hello");
        label2.setFont(new Font("Arial", Font.ITALIC, 50));
        label2.setForeground(Color.MAGENTA);
        label2.setBackground(Color.RED);
        label2.setOpaque(true);
        c.add(label2);

        setSize(400, 200);
        setVisible(true);
    }

    class BlueLabel extends JLabel {
        public BlueLabel(String s) {
            setText(s);
            setBackground(Color.BLUE);
        }

        @Override
        public void setBackground(Color bg) {
            super.setBackground(Color.BLUE);
        }
    }
}
