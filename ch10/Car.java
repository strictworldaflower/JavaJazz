package ch10;


import java.util.*;

public class Car {
    private String model; private boolean gasoline;
    private int age; private int mileage;

    public Car(String model, boolean gasoline, int age, int mileage) {
        this.model = model;
        this.gasoline = gasoline;
        this.age = age;
        this.mileage = mileage;
    }
    public String getModel() {return model;}
    public boolean isGasoline() { return gasoline;}

    public int getAge() {

        return age;
    }

    public int getMileage() {return mileage;}

    public String toString() {
        return String.format("Car(%s,%s,%d,%d)", model, gasoline, age, mileage);
    }
    public static final List<Car> cars = Arrays.asList(
            new Car("DogwithCar", true, 18, 210000), new Car("Cattaxi", false, 15, 200000),
            new Car("taxi", true, 12, 150000), new Car("Grand", false, 10, 220000),
            new Car("Sportscar", true, 10, 70000), new Car("lamborgini", true, 6, 100000),
            new Car("taxi", true, 5, 80000), new Car("DogwithCar", true, 2, 35000),
            new Car("Cart", false, 1, 10000), new Car("Sportscar", true, 1, 7000));


}
