package ch018;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try (Socket client = new Socket("localhost", 5000);
             OutputStream os = client.getOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(os);) {
            oos.writeObject("개발자엄세영");
            oos.flush();

        } catch (Exception e) {

        }
    }
}
