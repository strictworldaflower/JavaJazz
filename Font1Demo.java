package ch017;

import java.awt.*;

public class Font1Demo {
    public static void main(String[] args) {
        GraphicsEnvironment e =
                GraphicsEnvironment.getLocalGraphicsEnvironment();

        String[] fontNames = e.getAvailableFontFamilyNames();

        for (String s : fontNames)
            System.out.println(s);
    }
}
