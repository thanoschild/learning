public class Java10_loops {
    public static void main(String[] args) {
        
        // while loop
        int x = 5;
        while(x > 0) {
            System.out.println("Number is: " + x);
            x--;
        }

        // do while
        do {
            System.out.println("Number is: " + x);
            x++;
        }
        while(x < 5);

        // for loop
        for(int i = 0; i<x; i++) {
            System.out.println("Inside for loop");
        }
    }
}
