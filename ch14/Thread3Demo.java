package ch14;

public class Thread3Demo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.print("잘가. ");
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {

                }
            }
        };
        new Thread(task).start();
    }
}
