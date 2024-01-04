
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
} 

// handel exception by subclass
class A {
    public void show() {
        try {
            Class.forName("MyExcedption");
        }
        catch(ClassNotFoundException e) {
            System.out.println("class not found: " + e);
        }
    }
}


// throws exception to handel in base class
class B {
    public void show() throws ClassNotFoundException {
        Class.forName("MyExcedption");
    }
}


public class Java23_throwable {
    public static void main(String[] args) {
        System.out.println("execution started");

         int i = 15;
         int j = 0;
        
         try {
            j = 10/i;
            // to run the catch statement on some condition 
            if(j == 0) {
                throw new ArithmeticException("denominator is greater than numerator");
            }
            System.out.println(j);
         }
         catch(ArithmeticException e) {
            e.printStackTrace();
         }
         catch(Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
         }

         System.out.println();
         System.out.println();


         // create your own exception 
         try {
            j = 10/i;
            // to run the catch statement on some condition 
            if(j == 0) {
                throw new MyException("denominator is greater than numerator");
            }
            System.out.println(j);
         }
         catch(MyException e) {
            e.printStackTrace();
         }
         catch(Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
         }

         System.out.println("execution completed");
         System.out.println();
         System.out.println();

        // handle exception by subclass
        A obj = new A();
        obj.show();

        System.out.println();
        System.out.println();

        
        // handel exception by base class
        B obj2 = new B();
        try {
            obj2.show();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
            e.printStackTrace();
        }
    } 
}
