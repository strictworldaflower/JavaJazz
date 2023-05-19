package ch0203;

import javax.swing.*;

public class JFrame4Demo extends JFrame {
    JFrame4Demo() {
        setTitle("개발자 엄세영 ");

        JPanel p = new JPanel();
        JLabel l = new JLabel("개발자 엄세영");
        JButton b = new JButton("버튼");
        p.add(l);
        p.add(b);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame4Demo();
    }
}
