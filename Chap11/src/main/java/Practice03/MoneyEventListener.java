package Practice03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyEventListener extends JFrame {
    private final int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    private final JTextField textField;
    private final JTextField[] outputTextField;
    public MoneyEventListener() {
        setTitle("Money Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.PINK);

        JLabel money = new JLabel("금액");
        textField = new JTextField(10);
        JButton button = new JButton("계산");
        c.add(money);
        c.add(textField);

        CalculateListener cl = new CalculateListener();
        button.addActionListener(cl);
        c.add(button);

        String[] str = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
        outputTextField = new JTextField[8];
        for (int i = 0; i < 8; i++) {
            JLabel label = new JLabel(str[i]);
            c.add(label);

            outputTextField[i] = new JTextField(10);
            c.add(outputTextField[i]);
        }

        setSize(400, 300);
        setVisible(true);
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int money = Integer.parseInt(textField.getText());
            if (money == 0) return;
            for (int i = 0; i < 8; i++) {
                outputTextField[i].setText(Integer.toString(money/unit[i]));
                if (money > 0) money = money % unit[i];
            }
        }
    }
}
