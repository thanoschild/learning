class A {
    int age;

    public void show() {
        System.out.println("in show A");
    }

    class B {
        public void display() {
            System.out.println("in display B");
        }
    }

    // static can be use only in inner class
    static class C {
        public void config() {
            System.out.println("in config C");
        }
    }
}

public class Oops12_innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.display();

        A.C obj3 = new A.C();
        obj3.config();
    }
}
