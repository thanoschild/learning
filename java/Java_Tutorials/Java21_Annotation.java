/*
 *  - Annotations help to associate metadata (information) to the program elements i.e. 
 *    instance variables, constructors, methods, classes, etc.
 *  - Annotations are not pure comments as they can change the way a program is 
 *    treated by the compiler. 
 */

 /*
  * There are broadly 5 categories of annotations as listed:
    - Marker Annotations: @Override
    - Single value Annotations: @AnnotationName(value=6)
    - Full Annotations: @TestAnnotation(owner= ”name”, value= ”Class”)
    - Type Annotations: 
    - Repeating Annotations
  */

  /*
   * Predefined/ Standard Annotations
   * - @Deprecated, @Override and @SuppressWarnings included in java lang
   */

class A {
    public void show() {
        System.out.println("in show A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in show B");
    }
}


public class Java21_Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
