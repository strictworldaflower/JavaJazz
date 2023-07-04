package ch016;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class JRadioButtonTest extends JFrame {
    public JRadioButtonTest() {
        JRadioButton[] pet = new JRadioButton[3];
        String[] name = {"강아지", "고양이", "금붕어"};
        ImageIcon[] image = {
                new ImageIcon(getClass().getResource("images/a_puppy.jpg")),
                new ImageIcon(getClass().getResource("images/cat.png")),
                new ImageIcon(getClass().getResource("images/goldfish.png"))
        };
        JLabel label = new JLabel();

        setTitle("애완 동물");

        ButtonGroup bg = new ButtonGroup();
        JPanel panel1 = new JPanel();
        for (int i = 0; i < pet.length; i++) {
            pet[i] = new JRadioButton(name[i]);
            bg.add(pet[i]);
            panel1.add(pet[i]);
            pet[i].addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.DESELECTED)
                    return;
                else if (pet[0].isSelected())
                label.setIcon(image[0]);
                else if (pet[1].isSelected())
                    label.setIcon(image[1]);
                else

                label.setIcon(image[2]);


            });
        }
        pet[0].setSelected(true);
        add(panel1, BorderLayout.NORTH);

        JPanel panel2 = new JPanel();
        panel2.add(label);
        add(panel2, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new JRadioButtonTest();
    }
}
