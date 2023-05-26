package ch13;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";
        String output = "D:\\Temp\\dup.txt";

//        try (FileInputStream fis = new FileInputStream(input);
//             FileOutputStream fos = new FileOutputStream(output)) {
        try (FileReader fr = new FileReader(input);
             FileWriter fw = new FileWriter(output)) {


            int c;

            while ((c = fr.read()) != -1)
                fw.write(c);

            }catch (IOException e) {
            }


        }
        }

