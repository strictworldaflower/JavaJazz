package ch06;

public class OverTypeDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v.name);
        v.whoami();
        v.move();
    }
}
