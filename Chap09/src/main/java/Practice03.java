import javax.swing.*;
import java.awt.*;

public class Practice03 extends JFrame {
    public Practice03() {
        setTitle("Ten Number Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gridLayout = new GridLayout(1, 10);
        gridLayout.setVgap(3);

        Container container = getContentPane();
        container.setLayout(gridLayout);
        container.add(new JButton("0"));
        container.add(new JButton("1"));
        container.add(new JButton("2"));
        container.add(new JButton("3"));
        container.add(new JButton("4"));
        container.add(new JButton("5"));
        container.add(new JButton("6"));
        container.add(new JButton("7"));
        container.add(new JButton("8"));
        container.add(new JButton("9"));

        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Practice03 mf = new Practice03();
    }
}
