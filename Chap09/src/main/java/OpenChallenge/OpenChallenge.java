package OpenChallenge;

import javax.swing.*;
import java.awt.*;

public class OpenChallenge extends JFrame {
    public OpenChallenge() {
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        NorthPanel northPanel = new NorthPanel();
        CenterPanel centerPanel = new CenterPanel();

        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        OpenChallenge mf = new OpenChallenge();
    }
}
