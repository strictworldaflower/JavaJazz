package ch0203;
//
//import javax.swing.*;
//
//class MyFrame extends JFrame {
//    MyFrame() {
//        setTitle("개발자 엄세영");
//        setSize(500, 500);
//        setVisible(true);
//    }
//}
//
//public class Jframe {
//    public static void main(String[] args) {
//        new MyFrame();
//    }


import javax.swing.*;
class JFrame3Demo extends JFrame {
//public class JFrame3Demo extends JFrame {
    JFrame3Demo() {
        setTitle("개발자 엄세영");

        JButton b = new JButton("버튼");
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame3Demo();
    }
}
