package ch14;

class CarThread extends Thread {
    private String who;
    private  SharedCar car;
    private  String  where;

    public CarThread(String who, SharedCar car, String where) {
        this.who = who;
        this.car = car;
        this.where = where;

    }
    public void run() {
        car.drive(who,where);
    }
}

public class SychroDemo {
    public static void main(String[] args) {
        SharedCar car = new SharedCar();
        new CarThread("뺀지리", car, "서울").start();
        new CarThread("문둥이", car, "부산").start();
        new CarThread("깽깽이", car, "광주").start();
    }
}
