package Practice08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class DrawCircleEventFrame extends JFrame {
    private int startX, startY, disX, disY;
    private Vector<Circle> v;
    public DrawCircleEventFrame() {
        setTitle("마우스로 원 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        startX = 0;
        startY = 0;
        v = new Vector<>();

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                startX = e.getX();
                startY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                disX = Math.abs(e.getX() - startX);
                disY = Math.abs(e.getY() - startY);
                int r = (int) Math.sqrt(disX * disX + disY * disY);
                v.add(new Circle(startX - r, startY - r, r * 2));
                repaint();
            }
        });
        setContentPane(panel);
        setSize(700, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public MyPanel() {
            setFocusable(true);
            requestFocus();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < v.size(); i++) {
                System.out.println(v.get(i));
                g.drawOval(v.get(i).x, v.get(i).y, v.get(i).dist, v.get(i).dist);
            }
        }
    }
}
