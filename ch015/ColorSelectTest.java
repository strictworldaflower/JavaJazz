package ch015;

import javax.swing.*;
import java.awt.*;

public class ColorSelectTest extends JFrame {
    public ColorSelectTest() {
        setTitle("색상 선택기");

        JComboBox<String> colorList = new JComboBox<>();
        colorList.addItem("빨간색");
        colorList.addItem("초록색");
        colorList.addItem("파란색");
        JPanel p1 = new JPanel();
        p1.add(colorList);
        add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        JCheckBox background = new JCheckBox("배경 색");
        JCheckBox foreground = new JCheckBox("전경 색");
        p2.add(background);
        p2.add(foreground);
        add(p2, BorderLayout.CENTER);

        JPanel p3 = new JPanel();
        JButton ok = new JButton("예");
        JButton cancel = new JButton("아니오");
        p3.add(ok);
        p3.add(cancel);
        add(p3, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ColorSelectTest();
    }
}
