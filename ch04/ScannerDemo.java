package ch04;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int[][] array = {{2, 1}, {1}, {3, 4, 5}};
        for (int[] i : array)
            System.out.print(i.length);
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        System.out.printf("%d*%d는 %d 입니다.\n", x, y, x * y);

    }
}
