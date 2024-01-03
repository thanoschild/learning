/*
 * There are four types of access modifiers available in Java: 
 * - Default – No keyword required
 * - Private
 * - Protected
 * - Public
 */


 /*
  * - When no access modifier is specified for a class, method, or data member – 
  *   It is said to be having the default access modifier.
  * - having default access modifiers are accessible only within the same package.
  */
 // default access modfifier
 class A{

    /*
     * - The private access modifier is specified using the keyword private. 
     * - The methods or data members declared as private are accessible only 
     *   within the class in which they are declared.
     */
    // private access modifier
     private String password = "hdfus3ao";

     // to access private method or variables, we implements getter and setter 
     // function.
     public String getPassword() {
        return password;
     }

     /*
      * - The protected access modifier is specified using the keyword protected.
      * - The methods or data members declared as protected are accessible 
      *   within the same package or subclasses in different packages.
      */
     // protected access modifier
     protected void show() {
        System.out.println("in show");
     }

     /*
      * - The public access modifier is specified using the keyword public.
      * - The public access modifier has the widest scope among all 
      *   other access modifiers.
      * - Classes, methods, or data members that are declared as public are 
      *   accessible from everywhere in the program. There is no restriction 
      *   on the scope of public data members.
      */
     // public access modifier
     public String name = "sumeet";
 }

public class Oops5_accessModifier {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.getPassword());  // access by using getter and setter method
        obj.show(); // can be access within the package or its subclasses in diff package
        System.out.println(obj.name); // can be accessed from anywhere in this program
    }
}
