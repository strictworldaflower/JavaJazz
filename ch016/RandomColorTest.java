package ch016;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RandomColorTest extends JFrame {
    RandomColorTest() {
        setTitle("임의의 배경색");

        getContentPane().addMouseListener(new MyMouseListener());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);

    }

    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);

            JPanel p = (JPanel) e.getSource();
            p.setBackground(new Color(r, g, b));
        }
    }

    public static void main(String[] args) {
        new RandomColorTest();
    }
}
