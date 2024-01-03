// An interface in Java is a blueprint of a class. It has static constants and abstract methods
// the method you define in interface are by default public abstract

// Abstract methods are those types of methods that don't require implementation for its declaration

// class - class - extends
// class - interface - implements
// interface - interface - extends

interface A {
    int age = 10;           // final and static
    String area = "Bangalore";
    void show();
    void config();
}

interface C {
    void run();
}

interface D extends C {

}

// multiple inheritance
class B implements A , C {
    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void run() {
        System.out.println("In run function");
    }
}

public class Oops8_interface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        System.out.println(A.area);
    }
}
