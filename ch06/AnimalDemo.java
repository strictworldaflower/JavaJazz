package ch06;

class Animal {
public Animal(String s) {
    System.out.println("동물 : " + s);
}
}

class Mammel extends Animal {
    public Mammel() {
        super("원숭이");
        System.out.println("포유류 : 원숭이");
    }
    public Mammel(String s) {
        super(s);
        System.out.println("포유류 : " + s);

    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Mammel ape = new Mammel();
        Mammel lion = new Mammel("사자");
    }
}
