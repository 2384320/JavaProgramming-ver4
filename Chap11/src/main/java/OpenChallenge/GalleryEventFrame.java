package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Vector;

public class GalleryEventFrame extends JFrame {
    private int count;
    private Vector<ImageIcon> imageIcons;
    private JButton left, right;
    private JLabel label;
    public GalleryEventFrame() {
        setTitle("Open Challenge 11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        imageIcons = new Vector<>();

        File f = new File("images");
        File[] imageFiles = f.listFiles();
        for (int i = 0; i < imageFiles.length; i++) {
            if (imageFiles[i].isFile()) imageIcons.add(new ImageIcon(imageFiles[i].getPath()));
        }

        left = new JButton(new ImageIcon("images/arrow/left.png"));
        left.setSize(100, 100);
        right = new JButton(new ImageIcon("images/arrow/right.png"));
        right.setSize(100, 100);
        c.add(new MenuPanel(), BorderLayout.SOUTH);

        label = new JLabel();
        count = 0;
        label.setIcon(imageIcons.get(count));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        c.add(label, BorderLayout.CENTER);

        setSize(500, 700);
        setVisible(true);
    }

    class MenuPanel extends JPanel {
        public MenuPanel() {
            setBackground(Color.GRAY);
            setLayout(new FlowLayout());

            add(left);
            add(right);

            left.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count--;
                    count += imageIcons.size();
                    count %= imageIcons.size();
                    label.setIcon(imageIcons.get(count));
                }
            });
            right.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
                    count %= imageIcons.size();
                    label.setIcon(imageIcons.get(count));
                }
            });
        }
    }
}
