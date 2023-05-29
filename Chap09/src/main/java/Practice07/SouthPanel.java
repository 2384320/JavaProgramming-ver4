package Practice07;

import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground(Color.YELLOW);
        JLabel jLabel = new JLabel("계산 결과");
        JTextField jTextField = new JTextField(20);
        add(jLabel);
        add(jTextField);
    }
}
