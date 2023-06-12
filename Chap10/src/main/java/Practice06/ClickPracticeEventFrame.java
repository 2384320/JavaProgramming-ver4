package Practice06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ClickPracticeEventFrame extends JFrame {
    public ClickPracticeEventFrame() {
        super("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("C");
        label.setLocation(100, 100);
        label.setSize(10, 10);
        c.add(label);

        Random r = new Random();
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                if (la == null) return;
                int x = r.nextInt(300) + 100;
                int y = r.nextInt(200) + 100;
                la.setLocation(x, y);
            }
        });

        label.setFocusable(true);
        label.requestFocus();
    }
}
