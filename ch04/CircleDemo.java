package ch04;
class Circle {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10.0);
        Circle yourCircle = new Circle(5.0);

        System.out.println("원의 개수 : " + Circle.numOfCircles);
        System.out.println("원의 개수 : " + yourCircle.numCircles);

    }
    void print() {
        System.out.println("인스턴스 메서드입니다");

    }
}
