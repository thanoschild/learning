// System.in is an InputStream object that represents the 
// standard input, typically connected to the console or keyboard.



import java.util.Scanner;
import java.lang.*;

/*
 * when you write java.lang.* it includes all the files inside it not folder 
 * inside the java.lang
 */

public class Java2_input {
    public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        java.lang.System.out.println("Username is: " + userName);  // Output user input

        System.out.println("Username is: " + userName);
        /*
         * we don't need to import System.out.println() method because it 
         * belongs to java.lang package which is by default imported
         */
        
        myObj.close();
    }
  }
}
