package ch13;

import java.io.File;
import java.nio.file.*;
import java.util.stream.Stream;

public class Stream2Demo {
    public static void main(String[] args) throws Exception {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        Path p = new File("D:\\Temp\\number.txt").toPath();

        Stream<String> s = Files.lines(p);

        s.forEach(x -> System.out.println(x));

        s = Files.lines(p);

        s.map(x -> number[Integer.parseInt(x)])
                .forEach(x -> System.out.print(x + " "));
    }
}
