// Everything in Java is associated with classes and objects, along with its attributes and methods.
/*  
* A Class is like an object constructor, or a "blueprint" for creating objects.
* Objects are the instances of a class that are created to use the attributes and methods of a class.
*/

class Calc{
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class Man {
   String name;

   Man(String name) {
    // preference will always given to local varialbe so we have to use this operator
    // this -> reffer the current object
     this.name = name;
   }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Man that = (Man) obj;
        if(!this.name.equals(that.name)) return false;
        return true;
    }
}

public class Oops1_class {
    public static void main(String[] args) {
       int n1 = 3, n2 = 9;
       Calc obj = new Calc();
       int result = obj.add(n1, n2);
       System.out.println(result);

     Man obj1 = new Man("Thanos");
     Man obj2 = new Man("Thanos");
     System.out.println(obj1.equals(obj2));  // gives false if we don't override the equal method

     String s1 = new String("Sumeet");
     String s2 = new String("Sumeet");
     System.out.println(s1.equals(s2));      // gives true

     /* 
     * 1. Man class does not override the equals method, so it uses the 
     * default implementation from the Object class, which checks for 
     * reference equality.
     * 2. String class overrides the equals method to compare the actual 
     * content of the strings, not just their references.
     */
    }
}