package ch018;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CapServer {
    public static void main(String[] args) {
        System.out.println("WATO, 대문자 변환 서버 실행 중...");
        int clientNumber = 0;
        try (ServerSocket server = new ServerSocket(9000);) {
            while (true)
                new Capitalizer(server.accept(), clientNumber++).start();

        } catch (Exception e) {


        }


    }

    private static class Capitalizer extends Thread {
        private Socket connection;
        private int clientNumber;

        public Capitalizer(Socket socket, int clientNumber) {
            this.connection = socket;
            this.clientNumber = clientNumber;
            show("WATO 클라이언트" + clientNumber + "번과 포트" + socket + "번에서 새로운 연결");

        }

        public void run() {
            try (BufferedReader in = new BufferedReader(new
                    InputStreamReader(connection.getInputStream()));
                 PrintWriter out = new PrintWriter(connection.getOutputStream(), true);) {
                out.println("안녕하세요 WATO 클라이언트" + clientNumber + "번 입니다.");
                out.println("종료하시려면 그냥 .을 입력하십시오.\n");
                while (true) {
                    String input = in.readLine();
                    if (input == null || input.equals(".")) {
                        break;
                    }
                    out.println(input.toUpperCase());

                }

            } catch (IOException e) {

            } finally {
                try {
                    connection.close();
                } catch (IOException e) {

                }
                show("WATO 클라이언트" + clientNumber + "번과 연결 종료");
            }
        }

        private void show(String message) {
            System.out.println(message);
        }
    }
}