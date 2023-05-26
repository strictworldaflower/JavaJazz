package ch13;

import java.io.File;
import java.nio.file.Files;
import java.sql.SQLOutput;

public class Files1Demo {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\Temp\\org.txt");
        File f2 = new File("D:\\Temp");

        System.out.println("org.txt는 폴더?"
        + Files.isDirectory(f1.toPath())
        );

        System.out.println("Temp는 폴더? " + Files.isReadable(f1.toPath()));

        System.out.println("org.txt는 읽을 수 있는 파일? " + Files.isReadable(f1.toPath()));

        System.out.println("or.txt의 크기? " + Files.size(f1.toPath()));
    }
}
