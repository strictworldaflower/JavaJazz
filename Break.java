package ch0203;

public class Break {
    public static void main(String[] args) {
        int i = 1, j = 5;

        while (true) {
            System.out.print(i++);
            if (i >= j)
                break;
        }
    }

}
