package OpenChallenge;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Color.GRAY);
        add(new JButton("Open"));
        add(new JButton("Read"));
        add(new JButton("Close"));
    }
}
