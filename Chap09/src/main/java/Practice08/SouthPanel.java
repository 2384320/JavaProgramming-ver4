package Practice08;

import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground(Color.YELLOW);
        add(new JButton("Word Input"));
        add(new JTextField(20));
    }
}
