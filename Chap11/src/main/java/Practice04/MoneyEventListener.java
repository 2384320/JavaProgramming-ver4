package Practice04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyEventListener extends JFrame {
    private final JTextField priceTextField = new JTextField(12);
    private final int[] money = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
    private final JTextField[] outputs = new JTextField[8];
    private final JCheckBox[] checkBoxes = new JCheckBox[7];

    public MoneyEventListener() {
        setTitle("Money Charger with CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        JLabel priceLabel = new JLabel("금액");
        priceLabel.setSize(65, 50);
        priceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        c.add(priceLabel);

        priceTextField.setBounds(90, 15, 100, 20);
        c.add(priceTextField);

        JButton btn = new JButton("계산");
        btn.setBounds(200, 15, 70, 20);
        c.add(btn);

        String[] texts = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
        for (int i = 0; i < texts.length; i++) {
            JLabel price = new JLabel(texts[i]);
            price.setHorizontalAlignment(SwingConstants.RIGHT);
            price.setBounds(50, 45 + i * 20, 40, 20);
            c.add(price);

            outputs[i] = new JTextField(25);
            outputs[i].setBounds(110, 45 + i * 20, 70, 20);
            outputs[i].setHorizontalAlignment(SwingConstants.CENTER);
            c.add(outputs[i]);

            if (i < 7) {
                checkBoxes[i] = new JCheckBox();
                checkBoxes[i].setBackground(Color.PINK);
                checkBoxes[i].setBounds(200, 45 + i * 20, 20, 20);
                c.add(checkBoxes[i]);
            }

        }

        btn.addActionListener(new CalculateListener());
        setSize(300, 300);
        setVisible(true);
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int total = Integer.parseInt(priceTextField.getText());

            for (int i = 0; i < checkBoxes.length; i++) {
                if (checkBoxes[i].isSelected()) {
                    outputs[i].setText(Integer.toString(total / money[i]));
                    total = total % money[i];
                }
            }
            outputs[7].setText(Integer.toString(total));
        }
    }
}
