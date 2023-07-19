package Practice05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel {
    JLabel gun;
    JLabel bullet;
    JLabel target;
    public GamePanel() {
        setLayout(null);

        gun = new JLabel();
        gun.setSize(40, 40);
        gun.setOpaque(true);
        gun.setBackground(Color.BLACK);

        bullet = new JLabel();
        bullet.setSize(10, 10);
        bullet.setOpaque(true);
        bullet.setBackground(Color.RED);

        ImageIcon icon = new ImageIcon("img/target.jpg");
        target = new JLabel(icon);
        target.setSize(icon.getIconWidth(), icon.getIconHeight());

        add(gun);
        add(bullet);
        add(target);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                gun.setFocusable(true);
                gun.requestFocus();
            }
        });
    }

    public void start() {
        gun.setLocation(this.getWidth() / 2 - 20, this.getHeight() - 40);
        bullet.setLocation(this.getWidth() / 2 - 5, this.getHeight() - 50);
        target.setLocation(0, 0);

        TargetThread targetThread = new TargetThread(target, this);
        targetThread.start();

        gun.setFocusable(true);
        gun.requestFocus();
        gun.addKeyListener(new KeyAdapter() {
            BulletThread gunThread = null;
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    if (gunThread == null || !gunThread.isAlive()) {
                        gunThread = new BulletThread(bullet, target, targetThread);
                        gunThread.start();
                    }
                }
            }
        });
    }
}
