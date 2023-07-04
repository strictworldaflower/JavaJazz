package ch016;

import javax.swing.*;
import java.awt.*;

public class AdjustmentListenerDemo extends JFrame {
    AdjustmentListenerDemo() {
        setTitle("스크롤바 손잡이 움직이기");

        JLabel label = new JLabel("", JLabel.CENTER);

        JScrollBar bar = new JScrollBar(JScrollBar.VERTICAL);
        bar.setValue(50);
        bar.addAdjustmentListener(e -> {
            int v = e.getValue();
            label.setText("위치 : " + v);
        });
        add("Center", label);
        add("East", bar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AdjustmentListenerDemo();
    }
}
