package Practice03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageDragEventFrame extends JFrame {
    private ImageIcon icon = new ImageIcon("images/2.jpg");
    private JLabel label = new JLabel(icon);
    public ImageDragEventFrame() {
        setTitle("이미지 레이블 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        label.setLocation(50, 50);
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        c.add(label);

        label.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point p = e.getPoint();
                label.setLocation(p);
            }
        });

        setSize(500, 500);
        setVisible(true);
    }
}
