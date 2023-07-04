package ch016;

import javax.swing.*;
import java.awt.*;

public class KeyPadTest extends JFrame {
    private JPanel buttonPanel;
    private JButton clearButton;
    private JTextField display;

    public KeyPadTest() {
        setTitle("키패드");
        display = new JTextField(14);
        JPanel p1 = new JPanel();
        p1.add(display);
        add(p1, "North");

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3, 5, 5));

        addButton("7");
        addButton("8");
        addButton("9");
        addButton("4");
        addButton("5");
        addButton("6");
        addButton("1");
        addButton("2");
        addButton("3");
        addButton("0");
        addButton(".");

        clearButton = new JButton("CE");
        buttonPanel.add(clearButton);

        clearButton.addActionListener(e -> display.setText(""));

        JPanel p2 = new JPanel();
        p2.add(buttonPanel);
        add(p2, "Center");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(230, 210);
        setVisible(true);


    }

    private void addButton(final String label) {
        JButton button = new JButton(label);
        buttonPanel.add(button);
        button.addActionListener(e -> {
            if (label.equals(".") && display.getText().indexOf(".") != -1)
                return;
            display.setText(display.getText() + label);
        });
    }
    public double getVane() {
        return Double.parseDouble(display.getText());
    }
    public  void clear() {
        display.setText("");
    }

    public static void main(String[] args) {
        new KeyPadTest();
    }
}
