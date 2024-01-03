class A {
    public void display() {
        System.out.println("Showing base class");
    }
}

class B extends A {
    public void display() {
        System.out.println("Showing child class");
        super.display();
    }
}

public class Example {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        // obj.super.display();
    }
}
