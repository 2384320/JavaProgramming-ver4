import javax.swing.*;
import java.awt.*;

public class Practice05 extends JFrame {
    public Practice05() {
        setTitle("4x4 Color Frame");
        GridLayout gridLayout = new GridLayout(4, 4);

        Container container = getContentPane();
        container.setLayout(gridLayout);

        Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA,
                Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
                Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE};

        for (int i = 0; i < 16; i++) {

            JLabel jLabel = new JLabel(i+"");
            jLabel.setBackground(col[i]);
            jLabel.setOpaque(true);
            container.add(jLabel);
        }

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Practice05 mf = new Practice05();
    }
}
