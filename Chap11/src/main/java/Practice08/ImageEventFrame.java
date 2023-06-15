package Practice08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;

public class ImageEventFrame extends JFrame {
    private JRadioButton left, right;
    private JLabel imageLabel;
    private Vector<ImageIcon> imagesVector;

    public ImageEventFrame() {
        setTitle("Image Gallery Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        imagesVector = new Vector<>();

        File f = new File("images");
        File[] imageFiles = f.listFiles();
        for (File file : imageFiles) {
            if (file.isFile()) {
                ImageIcon icon = new ImageIcon(file.getPath());
                imagesVector.add(icon);
            }
        }

        left = new JRadioButton("left");
        right = new JRadioButton("right");
        c.add(new MenuPanel(), BorderLayout.NORTH);
        imageLabel = new JLabel(imagesVector.get(0));
        c.add(imageLabel, BorderLayout.CENTER);
        imageLabel.addMouseListener(new MyMouseListener(0));

        setSize(500, 300);
        setVisible(true);
    }
    class MenuPanel extends JPanel {
        public MenuPanel() {
            setLayout(new FlowLayout());

            ButtonGroup g = new ButtonGroup();
            g.add(left);
            g.add(right);

            add(left);
            add(right);

            left.setSelected(true);
        }
    }

    class MyMouseListener extends MouseAdapter {
        private int index;

        public MyMouseListener(int startIndex) {
            index = startIndex;
        }

        public void mouseReleased(MouseEvent e) {
            if (left.isSelected()) {
                index++;
                if (index >= imagesVector.size())
                    index = 0;
            } else {
                index--;
                if (index == -1)
                    index = imagesVector.size() - 1;
            }
            imageLabel.setIcon(imagesVector.get(index));
        }
    }
}
