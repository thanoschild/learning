class A {
    public void display() {
        System.out.println("Showing base class");
    }
}

class B extends A {
    public void display() {
        System.out.println("Showing child class");
    }
}

public class Example {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
        // obj.super.display();

        obj = new A();
        obj.display();
    }
}
