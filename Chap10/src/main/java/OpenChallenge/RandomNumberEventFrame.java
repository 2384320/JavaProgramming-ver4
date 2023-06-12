package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RandomNumberEventFrame extends JFrame {
    public RandomNumberEventFrame() {
        super("Open Challenge 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(null);
        JLabel[] label = new JLabel[3];
        JLabel result = new JLabel("시작합니다.");
        result.setSize(200, 20);
        result.setLocation(150, 200);

        for (int i = 0; i < 3; i++) {
            label[i] = new JLabel("0");
            label[i].setFont(new Font("Arial", Font.ITALIC, 30));
            label[i].setLayout(new BorderLayout());
            label[i].setBackground(Color.MAGENTA);
            label[i].setOpaque(true);
            label[i].setSize(60, 50);
            label[i].setForeground(Color.YELLOW);
            label[i].setLocation(800 * i / 10 + 80, 100);
            c.add(label[i]);
        }
        c.add(result);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyChar() == '\n') {
                    int a = (int) (Math.random() * 5);
                    int b = (int) (Math.random() * 5);
                    int c = (int) (Math.random() * 5);
                    label[0].setText(Integer.toString(a));
                    label[1].setText(Integer.toString(b));
                    label[2].setText(Integer.toString(c));
                    if (a == b && b == c) result.setText("축하합니다!!");
                    else result.setText("아쉽군요");
                }
            }
        });

        setFocusable(true);
        requestFocus();
    }
}
