class A {
    public void show() {
        System.out.println("in show A");
    }
}

abstract class B {
    public abstract void show();
    public abstract void config();
}


public class Oops13_anonymousClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("in new show");
            }
        };

        obj.show();  // anonymousClass 

        // abstract ans anonymousClass
        B obj2 = new B() {
            public void show() {
                System.out.println("in new abstract show");
            }

            public void config() {
                System.out.println("in new abstract config");
            }
        };

        obj2.show();
        obj2.config();
    }
}
