/* Variables in Java is a data container that saves the data values during 
   Java program execution.
*/

// There are three types of variables in Java Local variables, static variables, and instance variables.


/*
  * Differences between the Instance variables and the Static variables: 
  --> Each object will have its own copy of an instance variable, whereas we 
  can only have one copy of a static variable per class, irrespective of how 
  many objects we create. Thus, static variables are good for memory management.

  --> Changes made in an instance variable using one object will not be 
  reflected in other objects as each object has its own copy of the instance 
  variable. In the case of a static variable, changes will be reflected in 
  other objects as static variables are common to all objects of a class.

  --> We can access instance variables through object references, and static 
  variables can be accessed directly using the class name.

  --> Instance variables are created when an object is created with the use of 
  the keyword ‘new’ and destroyed when the object is destroyed. Static variables 
  are created when the program starts and destroyed when the program stops.
*/

public class Java3_variables {

    static int staticVar = 20;  // static varaible
    public static void exampleMethod() {
        System.out.println("Static Variable: " + staticVar);
    }

    int instanceVar;           // instance variable
    public Java3_variables(int val) {
        instanceVar = val;
    }

    public static void main(String[] args) {
        int localVar = 10;     // local variable
        System.out.println("Local Varaible: " + localVar);

        Java3_variables.exampleMethod();
        System.out.println(Java3_variables.staticVar);

        Java3_variables obj = new Java3_variables(localVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}
