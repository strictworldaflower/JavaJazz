package ch016;

import javax.swing.*;
import java.awt.*;

public class ButtonTest extends JFrame {
    public ButtonTest() {
        setTitle("배경색 바꾸기");

        JButton b = new JButton("클릭");
        JPanel p = new JPanel();
        p.add(b);
        add(p);

        b.addActionListener(e -> {
            if (p.getBackground() == Color.YELLOW)
                p.setBackground(null);
            else
                p.setBackground(Color.YELLOW);


        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ButtonTest();
    }
}
