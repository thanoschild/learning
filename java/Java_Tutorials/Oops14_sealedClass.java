// when you make final class you can inheritate the class
// can create sealed class 
sealed class A extends Thread implements Cloneable permits B, C, D {
   
}

final class B extends A {
   
}

non-sealed class C extends A {
   
}

sealed class D extends A permits E {
   
}

final class E extends D{
   
}

// can create seald interface
sealed interface X permits Y {

}

non-sealed interface Y extends X {

}

public class Oops14_sealedClass {
    public static void main(String[] args) {
        
    }
}
