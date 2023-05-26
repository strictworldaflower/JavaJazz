package ch14;

public class Interrupt1Demo {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                while (true) {
                    System.out.println("실행 중...");
                    Thread.sleep(1);
                }

            } catch (InterruptedException e) {

            }
            System.out.println("정상 종료");
        };
        Thread t = new Thread(task);
        t.start();
        try {
            Thread.sleep(3);

        } catch (InterruptedException e) {

        }
        t.interrupt();
    }
}
