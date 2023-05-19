package ch0203;

public class SignIncrement {
    public static void main(String[] args) {
//        int plusOne = 1;
//        int minusOne = -plusOne;
//        System.out.println("plusOne 은" + plusOne + "입니다");
//        System.out.println("minusOne 은" + minusOne + "입니다");

//        int x = 1, y = 1;
//        System.out.println("x = " + x + ",++x =" + ++x);
//        System.out.println("y = " + y + ",y++ =" + y++);
//        System.out.println("x = " + x + ",y =" + y);
        int x = 2;
        int y;
        y = (x == 1) ? 10 : 20;
        System.out.println(y);
        y = (x > 1) ? x++ : x + 20;
        System.out.println(x);
        System.out.println(y);
        System.out.println(5 > 3 ? "true" : "false");

    }
}
