import java.lang.*;
/*
 * when you write java.lang.* it includes all the files inside it not folder 
 * inside the java.lang
 */

public class Java16_package {
    public static void main(String[] args) {

        String userName = "sumeet";
        java.lang.System.out.println("Username is: " + userName);  // Output user input

        System.out.println("Username is: " + userName);
        /*
         * we don't need to import System.out.println() method because it 
         * belongs to java.lang package which is by default imported
         */
    }
}
