package ch14;

class JoinThread extends Thread {
    int total;
    public void  run() {
        for (int i = 0; i < 100; i++)
        total+=i;


        }
    }

public class JoinDemo {
    public static void main(String[] args) {
        JoinThread t = new JoinThread();
        t.start();

        System.out.println("총합 : " + t.total);
    }
}
