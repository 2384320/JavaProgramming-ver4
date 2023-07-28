package Practice07;

import javax.swing.*;
import java.util.Vector;

public class Snake {
    private final Vector<JLabel> vector = new Vector<>();

    public Snake() {
        ImageIcon head = new ImageIcon("img/target.jpg");
        JLabel label = new JLabel(head);
        label.setSize(head.getIconWidth(), head.getIconHeight());
        label.setLocation(100, 100);
        vector.add(label);

        ImageIcon body = new ImageIcon("img/target.jpg");
        for (int i = 1; i < 10; i++) {
            label = new JLabel(body);
            label.setSize(body.getIconWidth(), body.getIconHeight());
            label.setLocation(100 + i * 20, 100);
            vector.add(label);
        }
    }

    public void addIn(JPanel p) {
        for (JLabel jLabel : vector) p.add(jLabel);
    }

    public void move(int direction) {
        for (int i = vector.size() - 1; i > 0; i--) {
            JLabel b = vector.get(i);
            JLabel a = vector.get(i - 1);
            b.setLocation(a.getX(), a.getY());
        }

        JLabel head = vector.get(0);

        switch (direction) {
            case SnakePanel.LEFT:
                head.setLocation(head.getX() - 20, head.getY());
                break;
            case SnakePanel.RIGHT:
                head.setLocation(head.getX() + 20, head.getY());
                break;
            case SnakePanel.UP:
                head.setLocation(head.getX(), head.getY() - 20);
                break;
            case SnakePanel.DOWN:
                head.setLocation(head.getX(), head.getY() + 20);
                break;
        }
    }
}
