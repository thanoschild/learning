/*  
The static keyword in Java is mainly used for memory management. 
The static keyword in Java is used to share the same variable or method of a given class.
*/

/*
 * The static keyword is a non-access modifier in Java that is applicable for the following: 
    - Blocks
    - Variables
    - Methods
    - Classes
 */

class Mobile {
    static String name = "Apple";
    String model;
    int price;
    int serial_no;

    static int counter = 0;

    /*
     * A static method in Java is a method that is part of a class rather than 
     * an instance of that class. Every instance of a class has access to the method. 
     
     * The most common example of a static method is the main( ) method. 
     * Any static member can be accessed before any objects of its class 
     * are created, and without reference to any object. 
     
     * Methods declared as static have several restrictions: 
       - They can only directly call other static methods.
       - They can only directly access static data.
       - They cannot refer to this or super in any way.
     */
    // static method
    static int setSerialNo() {
        return ++counter;
    }

    Mobile(String model, int price) {
        this.model = model;
        this.price = price;
        this.serial_no = setSerialNo();
    }

    public void showFeature() {
       System.out.println("Mobile name: " + Mobile.name);
       System.out.println("Mobile model: " + model);
       System.out.println("Mobile price: " + price);
    }
}

public class Java14_static {

    /*
     * When a variable is declared as static, then a single copy of the variable 
     * is created and shared among all objects at the class level. 
     * Static variables are, essentially, global variables. 
     * All instances of the class share the same static variable.
     */
    // static variable
    static int a = 10;
    static int b;


    /*
     * If you need to do the computation in order to initialize your static variables, 
     * you can declare a static block that gets executed exactly once, 
     * when the class is first loaded. 
     */
    // static block
    static {
        System.out.println("static block initialized");
        b = 4*a;
    }

    public static void main(String[] args) {
        Mobile obj = new Mobile("15 pro", 150);
        obj.showFeature();


        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);

        int serial_No = Mobile.setSerialNo();
        System.out.println("serial no: " + serial_No);
    }
}
