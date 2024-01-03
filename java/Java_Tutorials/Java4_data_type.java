/*
  Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
  Non-Primitive Data Type or Object Data type: such as String, Array, etc.
*/

/*
 * Integer Types:
 byte: 8-bit signed two's complement integer (-128 to 127).
 short: 16-bit signed two's complement integer (-32,768 to 32,767).
 int: 32-bit signed two's complement integer (-2^31 to 2^31-1).
 long: 64-bit signed two's complement integer (-2^63 to 2^63-1).

 * Floating-Point Types:
  float: 32-bit IEEE 754 floating point.
  double: 64-bit IEEE 754 floating point.

 * Character Type:
  char: 16-bit Unicode character (0 to 65535).
  Boolean Type:

 * boolean: Represents true or false values
*/

public class Java4_data_type {

    // Custom data types
    class Person {
        String name;
        int age;

        // constructor, methods, etc.
    }

    // Primitive data types
    int age = 25;
    double salary = 50000.50;
    char grade = 'A';
    boolean isStudent = true;
    float val = 9.5f;
    long val2 = 736;

    // Reference data types
    String name = "John Doe";

    // Arrays
    int[] numbers = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        
    }
}
