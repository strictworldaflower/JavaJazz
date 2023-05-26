package ch13;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) {
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream("D:\\Temp\\data.dat"));
             DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Temp\\data.dat"));) {

            dos.writeDouble(1.0);
            dos.writeInt(1);
            dos.writeUTF("one");

            dos.flush();

            System.out.println(dis.readDouble());
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
        } catch (IOException e) {

        }
    }
}