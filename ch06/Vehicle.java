package ch06;

public class Vehicle {
    String name = "탈 것";

    void whoami() {
        System.out.println("나는 탈 것이다.");
    }
    static void move() {
        System.out.println("이동하다.");

    }
}

class Car extends Vehicle {
    String name = "자동차";

    void whoami() {
        System.out.println("나는 자동차이다.");
    }
    static void move() {
        System.out.println("달리다.");
    }
}

