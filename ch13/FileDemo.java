package ch13;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Windows");
        File[] fs = file.listFiles();

        for (File f : fs)
            if (f.isDirectory())
                System.out.printf("dir : %s\n", f);
        else
                System.out.printf("file: %s(%d bytes)\n", f, f.length());
    }
}
