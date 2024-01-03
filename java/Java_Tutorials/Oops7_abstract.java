abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Hen extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

public class Oops7_abstract {
    public static void main(String[] args) {
        Horse obj = new Horse();
        obj.walk();

        // Animal animal = new Animal();
        // animal.walk();
    }
}
