package Practice08;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);
        setSize(400, 350);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            JLabel jLabel = new JLabel("*");
            int x = r.nextInt(250);
            int y = r.nextInt(250);
            jLabel.setLocation(x, y);
            jLabel.setSize(20, 20);
            jLabel.setForeground(Color.RED);
            jLabel.setOpaque(true);
            add(jLabel);
        }

    }
}
