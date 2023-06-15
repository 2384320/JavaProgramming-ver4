package Practice02;

import javax.swing.*;

public class DragEventFrame extends JFrame {
    private MyPanel panel;
    public DragEventFrame() {
        setTitle("이미지 위에 원 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new MyPanel();
        setContentPane(panel);

        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public MyPanel() {

        }
    }
}
