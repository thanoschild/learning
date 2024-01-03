
// it cannot be inheritated 
final class A {
    public void show() {
        System.out.println("in show A");
    }
}

class B {

    // it cannot be override
    final public void show() {
        System.out.println("in show B");
    }
}

class C extends B {
    // * this will give error since the method that trying to override is final
  
    // public void show() {
    //     System.out.println("in show C");
    // }
}

public class Java18_final {
    public static void main(String[] args) {

        // it cannot be modfifed
        final int mod = (int) 1e9 + 7;
        System.out.println(mod);
    }
}
