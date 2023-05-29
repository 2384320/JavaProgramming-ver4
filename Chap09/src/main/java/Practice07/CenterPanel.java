package Practice07;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(new GridLayout(4, 4));
        String[] textArr = {"0", "1", "2", "3",
                "4", "5", "6", "7",
                "8", "9", "CE", "계산",
                "+", "-", "x", "/"};

        for (int i = 0; i < 16; i++) {
            JButton jButton = new JButton();
            add(jButton);
            jButton.setText(textArr[i]);
            if (i >= 12) {
                jButton.setBackground(Color.CYAN);
                jButton.setOpaque(true);
            }
        }
    }
}
