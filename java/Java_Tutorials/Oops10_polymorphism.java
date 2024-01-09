// polymorphism means that a call to a member function will cause a different function to be
// executed depending  on the type of object that invokes the function.

// Polymorphism is divided into two types :
// 1. Compile time Polymorphism
// 2. Runtime Polymorphism - virtual function

// Compile-time polymorphism is a polymorphism that is, the function call is resolved during the
// compilation process
// compile-time polymorphism is divide into two type:
// -> Function overloading
// -> Operator overloading


class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }

    // compile time polymorphism
    public void PrintInfo(int age) {
        System.out.println("student age: " + age);
    }

    public void PrintInfo(String name) {
        System.out.println("student name: " + name);
    }

    public void PrintInfo(int age, String name) {
        System.out.println("student age: " + age + " and name: " + name);
    }
}

/*
 * Runtime polymorphism:
 * It is also known as Dynamic Method Dispatch. It is a process in which a 
 * function call to the overridden method is resolved at Runtime. 
 * This type of polymorphism is achieved by Method Overriding.
 */

class A {
    public void show() {
        System.out.println("in show A");
    }
}

class B extends A {
    public void show() {
        System.out.println("in show B");
    }
}

class C extends A {
    public void show() {
        System.out.println("in show C");
    }
}


public class Oops10_polymorphism {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "sumeet";
        obj1.age = 11;

        obj1.PrintInfo(obj1.name);

        obj1.PrintInfo(44, "chandan");


        A obj = new A();
        obj.show();

        obj = new B();
        obj.show(); // override the class B show method

        obj = new C();
        obj.show(); // override the class C show method
        // this is called dynamic method dispatch 
    }
}