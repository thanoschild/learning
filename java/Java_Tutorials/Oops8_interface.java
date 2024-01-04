// An interface in Java is a blueprint of a class. It has static constants and abstract methods
// the method you define in interface are by default public abstract

// Abstract methods are those types of methods that don't require implementation for its declaration

// class - class - extends
// class - interface - implements
// interface - interface - extends

/*
 * Types of interfaces in Java are mentioned below:
 * - Normal Interface - containes more than 2 methods
 * - Functional Interface - one method only
 * - Marker interface - empty interface 
 *   :- Examples of marker interface are Serializable, Cloneable and Remote interface.
 */

interface A {
    int age = 10;           // final and static
    String area = "Bangalore";
    void show();   // by default public abstract
    void config();
}

interface C {
    void run();
}

interface D extends C {

}

// multiple inheritance
class B implements A , C {
    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void run() {
        System.out.println("In run function");
    }
}



// mraker Interface
/*
 * Cloneable interface is present in java.lang package. There is a method clone()
 * in Object class. A class that implements the Cloneable interface indicates 
 * that it is legal for clone() method to make a field-for-field copy of 
 * instances of that class. 
 * Invoking Object’s clone method on an instance of the class that does not 
 * implement the Cloneable interface results in an exception 
 * CloneNotSupportedException being thrown. By convention, classes that 
 * implement this interface should override Object.clone() method.
 */
class Demo implements Cloneable { 
    int i; 
    String s; 
  
    // A class constructor 
    public Demo(int i,String s) 
    { 
        this.i = i; 
        this.s = s; 
    } 
  
    // Overriding clone() method 
    // by simply calling Object class 
    // clone() method. 
    @Override
    protected Object clone() 
    throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
}


// can declare only one method in function interface
@FunctionalInterface 
interface Func {
    void display();
    // void print();
}


// can declare only one method in function interface
@FunctionalInterface 
interface Func1 {
    void display(int i, int j);
    // void print();
}


public class Oops8_interface {
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj;
        obj = new B();
        obj.config();
        System.out.println(A.area);


        Func obj2 = new Func() {
            public void display() {
                System.out.println("in display Func");
            }
        };
        obj2.display();

        // using lambda expression to create anonymous object only in for functional interface
        Func1 obj3 = (i, j) -> System.out.println("in new display Func: " + (i + j));
        obj3.display(3, 6);




        Demo a = new Demo(20, "sumeet"); 
  
        // cloning 'a' and holding 
        // new cloned object reference in b 
  
        // down-casting as clone() return type is Object 
        Demo b = (Demo)a.clone(); 
  
        System.out.println(b.i); 
        System.out.println(b.s); 
    }
}
