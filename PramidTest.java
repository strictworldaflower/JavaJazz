package ch0203;

import java.util.Scanner;

public class PramidTest {
    public static void main(String[] args) {
//        System.out.println("     *       ");
//        System.out.println("    ***      ");
//        System.out.println("   *****     ");
//        System.out.println("  ********   ");
//        System.out.println(" *********** ");
//        System.out.println("*************");
//        Scanner in = new Scanner(System.in);

//        System.out.print("정수를 입력하시오 : ");
//        int i = in.nextInt();
//        System.out.printf("%d의 제곱은 %d\n", i, i * i);
//        Scanner in = new Scanner(System.in);

//        System.out.print("원기둥의 밑면의 반지름은? ");
//        double r = in.nextDouble();
//        System.out.print("원기둥의 높이는? ");
//        double h = in.nextDouble();
//        System.out.println("원기둥이 부피는" + 3.14 * r * r * h);
        Scanner in = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 : ");
        int t = in.nextInt();
        int s = t % 60;
        int m = (t / 60) % 60;
        int h = (t / 60) / 60;
        System.out.printf("%d시간 %d분 %d초\n", h, m, s);
    }
}
