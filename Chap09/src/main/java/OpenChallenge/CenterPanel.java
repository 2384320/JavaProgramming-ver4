package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);
        setSize(400, 350);

        Random r = new Random();
        String[] textArr = {"Java", "Love", "Hello"};
        for (int i = 0; i < textArr.length; i++) {
            JLabel jLabel = new JLabel(textArr[i]);
            int x = r.nextInt(250);
            int y = r.nextInt(250);
            jLabel.setLocation(x, y);
            jLabel.setSize(50, 50);
            jLabel.setOpaque(true);
            add(jLabel);
        }

    }
}
