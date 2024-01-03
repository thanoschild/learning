class Calc {

   public int add(int n1, int n2) {
     return n1 + n2;
   }

   /*
    * - Method overloading focuses on providing multiple methods with the same name 
    *   but different parameters within a class
    * - Method overloading is a compile-time polymorphism.
    * - Method overloading helps to increase the readability of the program.
    * - It occurs within the class.
    * - Private and final methods can be overloaded.
    */
   // method overloading
   public int add(int n1, int n2, int n3) {
     return n1 + n2 + n3;
   }
}

class AdvCalc {

  /*
   * - method overriding allows subclasses to provide their own implementation 
   *   of inherited methods from the parent class
   * - Method overriding is a run-time polymorphism.
   * - It is performed in two classes with inheritance relationships.
   * - Private and final methods can’t be overridden.
   */
  // method overriding - 
  public int add(int n1, int n2) {
     return n1 + n2 + 1;
   }
}

public class Oops3_methods {
    int x = 10;
    public static void main(String[] args) {
         Calc obj = new Calc();
         int result = obj.add(4, 5, 4);
         System.out.println(result);

         Oops3_methods myObj = new Oops3_methods();
         System.out.println(myObj.x);
    }
}
