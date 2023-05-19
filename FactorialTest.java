//package ch0203;
//
//import java.util.Scanner;
//
//public class FactorialTest {
//    public static void main(String[] args) {
//        int result;
//        int n;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("팩토리얼 값을 구할 정수 : ");
//        n = in.nextInt();
//
//        result = 1;
//        while (true) {
//            if (n > 0)
//                result *= n--;
//                else
//                break;
//            }
//            System.out.println(result);
//        }

//    public static void main(String[] args) {
//        int result;
//        int n;
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("팩토리얼 값을 구할 정수 : ");
//        n = in.nextInt();
//
//        result = factorial(n);
//        System.out.println(result);
//    }
//        static int factorial(int x ) {
//            int r = 1;
//            while (x > 0) {
//                r*=x--;
//            }
//            return r;
//        }
//    }

//    public static void main(String[] args) {
//        int result;
//        int n;
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("팩토리얼 값을 구할 정수 : ");
//        n = in.nextInt();
//
//        result = factorial(n);
//        System.out.println(result);
//    }
//
//    static int factorial(int x) {
//        int r = 1;
//        while (x > 0) {
//            r *= x--;
//        }
//        return r;

//    }
//}
//public class FactorialTest {
//    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(factorial(1, 5));
//        System.out.println(factorial(3, 5));
//        System.out.println(factorial(10, 5));
//
//    }
//    static int factorial(int x) {
//        int r = 1;
//        while (x > 0) {
//            r *= x--;
//        }
//        return r;
//    }
//    static int factorial(int x) {
//        int r = 1;
//        while (x > 0) {
//            r *= x--;
//
//        }
//        return r;
//    }
//
//    static int factorial(int x, int y) {
//        int r = 1;
//        while (x <= y) {
//            r *= x++;
//
//        }
//        return r;
//    }
//}

