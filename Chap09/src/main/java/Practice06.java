import javax.swing.*;
import java.awt.*;

public class Practice06 extends JFrame {
    public Practice06() {
        setTitle("Random Labels");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        for (int i = 0; i < 20; i++) {
            JLabel jLabel = new JLabel();
            int x = (int)(Math.random()*200) + 50;
            int y = (int)(Math.random()*200) + 50;

            jLabel.setLocation(x, y);
            jLabel.setBackground(Color.BLUE);
            jLabel.setSize(10, 10);
            jLabel.setOpaque(true);
            container.add(jLabel);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        Practice06 mf = new Practice06();
    }
}
