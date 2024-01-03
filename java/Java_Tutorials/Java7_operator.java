/*
  * 1. Arithmetic Operators
    -> * : Multiplication
    -> / : Division
    -> % : Modulo
    -> + : Addition
    -> – : Subtraction

  * 2. Relational Operators:
    -> == (Equal to)
    -> != (Not equal to)
    -> > (Greater than)
    -> < (Less than)
    -> >= (Greater than or equal to)
    -> <= (Less than or equal to)

   * 3. Logical Operators:
    -> && (Logical AND)
    -> || (Logical OR)
    -> ! (Logical NOT)

   * 4. Assignment Operators:
    -> = (Assignment)
    -> += (Addition assignment)
    -> -= (Subtraction assignment)
    -> *= (Multiplication assignment)
    -> /= (Division assignment)
    -> %= (Modulus assignment)

   * 5. Increment/Decrement Operators:
    -> ++ (Increment by 1)
    -> -- (Decrement by 1)

   * 6. Bitwise Operators:
    -> & (Bitwise AND)
    -> | (Bitwise OR)
    -> ^ (Bitwise XOR)
    -> ~ (Bitwise NOT)
    -> << (Left shift)
    -> >> (Right shift)
    -> >>> (Unsigned right shift)

   * 7. Conditional (Ternary) Operator:
    -> ? : (Conditional operator)

*/

public class Java7_operator {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int result = a + b;    // + operator
        System.out.println(result);

        a++;  // Post-Increment
        ++a;  // Pre-Increment
        a += 2;  //  Assignment Operators
        a ^= 10;  // a xor 10 and stored in a
        System.out.println(a);
    }
}
