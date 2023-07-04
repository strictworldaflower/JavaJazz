package ch015;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class Calculatorman extends JFrame {
    Calculatorman() {
        setTitle("계산기");

//        입력 창

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showSouth();



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setVisible(true);

    }

    void showSouth() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("on");
        JButton reset = new JButton("off");

        panel.add(cal);
        panel.add(reset);

//        add(panel, BorderLayout.);
    }
    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(1, 0));

        JLabel l1 = new JLabel("");

        JTextField t1 = new JTextField(10);
        t1.setEnabled(false);

        p1.add(l1);
        p1.add(t1);

        panel.add(p1);

        add(panel, BorderLayout.NORTH);
//        입력 창 끝
    }

    public static void main(String[] args) {
        new Calculatorman();
    }

}
