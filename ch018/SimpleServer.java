package ch018;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000);
        Socket connection = server.accept();
        InputStream is = connection.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);) {

            String str = (String) ois.readObject();
            System.out.println("받은 문자열 = " + str);

        }catch (Exception e ) {

        }
    }
}
