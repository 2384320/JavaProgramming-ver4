package Practice03;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.util.Calendar;

public class ClockEventFrame extends JFrame {

    public ClockEventFrame() {
        setTitle("디지털 시계 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(new MyLabel());

        setSize(400, 300);
        setVisible(true);
    }
}

class MyLabel extends JLabel implements Runnable {
    Thread thread;

    MyLabel() {
        setText(makeString());
        setFont(new Font("Arial", Font.ITALIC, 50));
        setHorizontalAlignment(JLabel.CENTER);
        thread = new Thread(MyLabel.this);
        thread.start();
    }

    String makeString() {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        String clockText = Integer.toString(hour).concat(":")
                .concat(Integer.toString(min)).concat(":")
                .concat(Integer.toString(second));
        return clockText;
    }


@Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                setText(makeString());
            }
        }
    }
}