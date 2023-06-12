package ch07;

public interface Controllable {
    default void repair() {
        show("장비를 수리한다.");
    }
    static void reset() {
        System.out.println("장비를 초기화한다.");
    }
    private void show(String s) {
        System.out.println(s);
    }

    void turnOn();
    void turnOff();

}
