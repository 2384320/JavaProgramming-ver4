package Practice07;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Color.GRAY);
        JLabel jLabel = new JLabel("수식입력");
        JTextField jTextField = new JTextField(20);
        add(jLabel);
        add(jTextField);
    }
}
