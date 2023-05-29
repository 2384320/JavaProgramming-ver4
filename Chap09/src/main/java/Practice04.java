import javax.swing.*;
import java.awt.*;

public class Practice04 extends JFrame {
    public Practice04() {
        setTitle("Ten Number Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gridLayout = new GridLayout(1, 10);
        gridLayout.setVgap(3);

        Container container = getContentPane();
        container.setLayout(gridLayout);
        container.add(new JButton("0")).setBackground(Color.RED);
        container.add(new JButton("1")).setBackground(Color.ORANGE);
        container.add(new JButton("2")).setBackground(Color.YELLOW);
        container.add(new JButton("3")).setBackground(Color.GREEN);
        container.add(new JButton("4")).setBackground(Color.CYAN);
        container.add(new JButton("5")).setBackground(Color.BLUE);
        container.add(new JButton("6")).setBackground(new Color(140, 0, 255));
        container.add(new JButton("7")).setBackground(Color.GRAY);
        container.add(new JButton("8")).setBackground(Color.PINK);
        container.add(new JButton("9")).setBackground(Color.LIGHT_GRAY);

        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Practice04 mf = new Practice04();
    }
}
