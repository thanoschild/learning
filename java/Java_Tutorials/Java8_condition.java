public class Java8_condition {
    public static void main(String[] args) {
        int x = 10;
        if(x > 10 && x <= 20) {                // if else conditions
            System.out.println("hello");
        }
        else {
            System.out.println("bye");
        }


        int n = 10;
        String result = n%2 == 0 ? "even" : "odd";   // Conditional or ternary operator
        System.out.println(result);
    }
}
