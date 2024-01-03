// The capability of a class to derive properties and characteristics from another class is called Inheritance.
// There are 5 Types of Inheritance in C++ :
// 1. Single Inheritance.
// 2. Multiple Inheritance.
// 3. Multilevel Inheritance.
// 4. Hierarchical Inheritance.
// 5. Hybrid Inheritance.

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    public void area() {
        System.out.println("Displays area");
    }
}

// single inheritance
class Triangle extends Shape {
    Triangle(String color) {
        super(color);
    }

    public void area(int l, int h) {
       System.out.println("Area of tiangle: " + (0.5 * (l * h)));
    }
}

// Hierarchical Inheritance.
class Circle extends Shape {
    Circle(String color) {
        super(color);
    }

    public void area(int r) {
        System.out.println("Area of circle: " + 3.14*r*r);
    }
}

// multilevel inheritance
class EquilateralTriangle extends Triangle {
    EquilateralTriangle(String color) {
        super(color);
    }

    public void area(int l, int h) {
        System.out.println("Area of EquilateralTriangle: " + (0.5 * (l * h)));
    }
}

public class Oops6_Inheritance {
    public static void main(String[] args) {
       Triangle obj1 = new Triangle("red");
       obj1.area(4, 10);

       EquilateralTriangle obj2 = new EquilateralTriangle("green");
       obj2.area(4, 20);
       Triangle par = obj2;
       par.area(4, 20);
    }
}
