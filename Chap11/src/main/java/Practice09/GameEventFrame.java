package Practice09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameEventFrame extends JFrame {
    private JButton[] btn;
    private ImageIcon[] imageIcon = {
            new ImageIcon("images/1.png"),
            new ImageIcon("images/2.png"),
            new ImageIcon("images/3.png")
    };
    private JLabel userLabel, computerLabel, result;
    private int user, computer;

    public GameEventFrame() {
        setTitle("가위 바위 보 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        btn = new JButton[3];

        userLabel = new JLabel("me");
        computerLabel = new JLabel("com");

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        for (int i = 0; i < 3; i++) {
            btn[i] = new JButton(imageIcon[i]);
            btn[i].addActionListener(new GameListener(i));
            topPanel.add(btn[i]);
        }
        topPanel.setBackground(Color.GRAY);
        c.add(topPanel, BorderLayout.NORTH);

        result = new JLabel();
        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        center.add(userLabel);
        center.add(computerLabel);
        result.setForeground(Color.RED);
        center.add(result);
        center.setBackground(Color.YELLOW);
        c.add(center, BorderLayout.CENTER);

        setSize(1500, 1000);
        setVisible(true);
    }

    class GameListener implements ActionListener {
        int index;

        GameListener(int i) {
            index = i;
        }

        public void actionPerformed(ActionEvent e) {
            user = index;
            computer = (int) (Math.random() * 3);
            userLabel.setIcon(imageIcon[user]);
            computerLabel.setIcon(imageIcon[computer]);

            if (user == computer) {
                result.setText("SAME!!");
            } else if (user - computer == -2 || user - computer == 1) {
                result.setText("ME !!");
            } else {
                result.setText("COM !!");
            }
        }
    }
}
