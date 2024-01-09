import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java24_bufferedReader {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.out.println("Enter a number");
        BufferedReader bf = null;

        // try with finally
        try {
            // InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(new InputStreamReader(System.in));  // belong to java.io package

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } 
        finally {
            bf.close();
        }

        // try with resource
        try(BufferedReader bff = new BufferedReader(new InputStreamReader(System.in));) {
            int num = Integer.parseInt(bff.readLine());
            System.out.println(num);
        }


        // new way of taking input
        // in is an object of InputStream class
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
        sc.close();
    }
}
