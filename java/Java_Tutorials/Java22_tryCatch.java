/*
 * In Java exception is an “unwanted or unexpected event”, that occurs during 
 * the execution of the program. When an exception occurs, the execution of the 
 * program gets terminated. To avoid these termination conditions we can use 
 * try catch block in Java.
 */

 /* 
  * The try statement allows you to define a block of code to be tested for 
  * errors while it is being executed.
  * The catch statement allows you to define a block of code to be executed, 
  * if an error occurs in the try block.
 */

public class Java22_tryCatch {
    public static void main(String[] args) {
         System.out.println("execution started");

         int i = 5;
         int j = 0;
         int[] arr = new int[5];
         String str = "";

         try {
            j = 10/i;
            System.out.println(j);
         }
         catch(Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
         }


        //  multiple catch block 
         try {
            j = 10/i;
            System.out.println(j);

            System.out.println(arr[3]);

            System.out.println(str.length());
         }
         catch(ArithmeticException e) {
            System.out.println("cannot divided by zero");
            e.printStackTrace();
         }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("cannot access index 5");
            e.printStackTrace();
         }
         catch(Exception e) {
            System.out.println("something went wrong");
            e.printStackTrace();
         }

         System.out.println("execution completed");
    }
}
