package Practice02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputTextEventFrame extends JFrame {
    private final JComboBox<String> comboBox;
    public InputTextEventFrame() {
        setTitle("JTextField and JComboBox Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextField textField = new JTextField(12);
        comboBox = new JComboBox<>();
        c.add(textField);

        InputStringListener isl = new InputStringListener();
        textField.addActionListener(isl);
        c.add(comboBox);

        setSize(300, 150);
        setVisible(true);
    }

    class InputStringListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField textField = (JTextField) e.getSource();
            comboBox.addItem(textField.getText());
        }
    }
}
