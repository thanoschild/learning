// constructor name should be same as class name.
// constructor doesn't have any return type.
// constructor is called onces when the object is created.

class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("parametrised Constructor");
    }

    Student(Student obj) {
        this.age = obj.age;
        this.name = obj.name;
        System.out.println("Copy Constructor");
    }
}


class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(); // every constructor has super by default if we don't write still it is there 
        System.out.println("in B");
    }

    public B(int n) {
        this(); // this method use to execute the default constructor of its own class
        System.out.println("in B int");
    }
}


public class Oops2_constructor {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "Sai";
        obj1.age = 22;

        Student obj2 = new Student(22, "sumeet");
        System.out.println(obj2.name);

        Student obj3 = new Student(obj1);
        System.out.println(obj3.name);


        // B b = new B(5);

        new A();   // anonymous object can you use once and can't reuse it.
        new A(5);   // anonymous object
    }
}



/*
 * naming convension:
 * class and interface -: start with capital letter then small (camel case)
 * for example: Calc, Human
 * 
 * variable and methods -: start with small letter 
 * for example: marks, checkFlag,  display(), addNum()
 * 
 * constant -: all capital
 * for example: MOD, PIE, MY_DATA
 */