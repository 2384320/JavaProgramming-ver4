package Practice01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ButtonEnableEventFrame extends JFrame {
    private static JButton button;
    public ButtonEnableEventFrame() {
        setTitle("CheckBox Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox check1 = new JCheckBox("버튼 비활성화");
        JCheckBox check2 = new JCheckBox("버튼 감추기");
        button = new JButton("test button");
        c.add(check1);
        c.add(check2);
        c.add(button);

        ButtonItemListener bil = new ButtonItemListener();
        check1.addItemListener(bil);
        check2.addItemListener(bil);
    }

    static class ButtonItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            JCheckBox cb = (JCheckBox) e.getSource();
            String text = cb.getText();
            if (cb.isSelected()) {
                if (text.equals("버튼 비활성화")) button.setEnabled(false);
                else if (text.equals("버튼 감추기")) button.setVisible(false);
            } else {
                if (text.equals("버튼 비활성화")) button.setEnabled(true);
                else if (text.equals("버튼 감추기")) button.setVisible(true);
            }
        }
    }
}
