package ch06;

public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Ball c2 = new Ball("빨간색");

        System.out.println("원:");
        c1.findRadius();
        c1.findArea();
        System.out.println("\n공 :");
        c2.findRadius();
        c2.findColor();
        c2.findArea();
        c2.findVolume();
        c2.fireball();
    }
}
