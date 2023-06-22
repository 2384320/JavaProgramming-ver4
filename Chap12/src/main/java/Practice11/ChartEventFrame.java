package Practice11;

import javax.swing.*;
import java.awt.*;

public class ChartEventFrame extends JFrame {
    private String[] menu = {"apple", "cherry", "strawberry", "prune"};
    private Color[] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.YELLOW};
    public ChartEventFrame() {
        setTitle("파이 차트 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        NorthPanel northPanel = new NorthPanel();
        c.add(northPanel, BorderLayout.NORTH);

        CenterPanel centerPanel = new CenterPanel();
        c.add(centerPanel, BorderLayout.CENTER);

        setSize(600, 400);
        setVisible(true);
    }

    class NorthPanel extends JPanel {
        private JLabel[] labels = new JLabel[menu.length];
        private JTextField[] textFields = new JTextField[menu.length];
        public NorthPanel() {

            for (int i = 0; i < menu.length; i++) {
                labels[i] = new JLabel(menu[i]);
                textFields[i] = new JTextField(5);

                add(labels[i]);
                add(textFields[i]);
            }
            setBackground(Color.LIGHT_GRAY);
        }
    }

    class CenterPanel extends JPanel {
        private JLabel[] percentLabels = new JLabel[menu.length];
        public CenterPanel() {
            for (int i = 0; i < menu.length; i++) {
                percentLabels[i] = new JLabel(menu[i]);
                percentLabels[i].setForeground(color[i]);

                add(percentLabels[i]);
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(200, 50, 200, );
        }
    }
}
