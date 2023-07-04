package ch018;

import java.io.*;
import java.net.*;

public class Echo2Server extends Thread {
    protected static boolean cont = true;
    protected Socket connection = null;

    public static void main(String[] args) throws IOException {
        ServerSocket server = null;

        server = new ServerSocket(5000);
        System.out.println("서버 소켓 생성");

        while (cont) {
            System.out.println("연결 대기 중...");
            new Echo2Server(server.accept());
        }
        server.close();
    }
    private Echo2Server(Socket clientSocket) {
        connection = clientSocket;
        start();
    }
    public void run() {
        BufferedReader in;
        System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성");
        try {
            in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );

            String msg;

            while ((msg = in.readLine()) != null) {
                System.out.println("읽은 메시지 메아리 : " + msg);

            }

            in.close();
            connection.close();

        } catch (IOException e) {

        }
    }
}
