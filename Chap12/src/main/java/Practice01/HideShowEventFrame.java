package Practice01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HideShowEventFrame extends JFrame {
    private MyPanel panel;
    public HideShowEventFrame() {
        setTitle("이미지 그리기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new MyPanel();
        setContentPane(panel);

        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private JButton btn = new JButton("Hide/Show");
        private ImageIcon icon = new ImageIcon("images/1.jpg");
        private Image image = icon.getImage();

        public MyPanel() {
            setLayout(new FlowLayout());
            add(btn);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (image == null) image = icon.getImage();
                    else image = null;
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}
