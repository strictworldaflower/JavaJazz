package ch0203;

import java.util.Scanner;

public class RPS1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("철수: ");
        String c = in.next();
        System.out.println("영희: ");
        String y = in.next();

        if (c.equals(y)) {
            System.out.println("무승부!");
            if (c.equals("r")) {
                if (y.equals("p"))
                    System.out.println("영희, 승");
                else
                    System.out.println("철수, 승");
            } else if (c.equals("p")) {
                if (y.equals("s"))
                    System.out.println("영희, 승");
                else
                    System.out.println("철수, 승");

            } else {
                if (y.equals("r"))
                    System.out.println("영희, 승");
                else
                    System.out.println("철수, 승");

            }
        }
    }
}
