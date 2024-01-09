/*  
    Abstract methods are those types of methods that don't require 
    implementation for its declaration
*/

/*
 * - An instance of an abstract class can not be created.
 * - Constructors are allowed.
 * - We can have an abstract class without any abstract method.
 * - We can define static methods in an abstract class
 * - There can be a final method in abstract class but any abstract method 
 *   in class but can not be declared as final 
 * - If a class contains at least one abstract method then compulsory 
 *   should declare a class as abstract 
 */

abstract class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("All animal eats");
    }
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

        // Animal animal = new Animal(); // this will give error as an instance of abstract class cannot be created
        // animal.walk();
    }
}
