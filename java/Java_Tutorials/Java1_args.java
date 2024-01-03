// jvm <-- jre(library) <-- OS <-- Hardware.
// every system have jvm init. 
// java is platform independent it will run in any machine irrespective of hardware and os but the only thing that required is 
// that machine need to have jvm.
// java_code --> javac --> byte code --> jvm
// jvm start execute first main method


// The main method in Java has a String array as an argument to receive any
// command-line arguments passed to the program when it is executed

public class Java1_args {

   public static void main(String[] args) {
      if (args.length > 0) {
         System.out.println("Arguments passed:");
         for (String arg : args) {
            System.out.println(arg);
         }
      } else {
         System.out.println("No arguments passed.");
      }

   }
}