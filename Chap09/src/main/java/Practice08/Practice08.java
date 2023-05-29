package Practice08;

import javax.swing.*;
import java.awt.*;

public class Practice08 extends JFrame {
    public Practice08() {
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        NorthPanel northPanel = new NorthPanel();
        CenterPanel centerPanel = new CenterPanel();
        SouthPanel southPanel = new SouthPanel();

        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);
        container.add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        Practice08 mf = new Practice08();
    }
}
