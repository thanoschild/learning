import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Java36_fileWrite {
    public static void main(String[] args) throws IOException {

        /*
         * using FileWrite Method class
         */
        FileWriter file = new FileWriter("test.csv");
        String str = "Hello World!";
        file.write(str);
        file.close();


        /*
         * using writeString() method
         */
        str = "Hello World!\nThis is second method";
        Path filePath  = Path.of("/Users/sumeet/Public/learning/java/Java_Tutorials/test.csv");
        Files.writeString(filePath, str); 


       /*
        * using bufferedWriter class
        */
        file = new FileWriter("test.csv");
        BufferedWriter bw = new BufferedWriter(file);
        str = "Hello World!\nThis is third method";
        bw.write(str);
        bw.close();


        /*
         * using fileOutputStream
         */
        try (FileOutputStream fout = new FileOutputStream("test.csv")) {
        //    FileOutputStream fout = new FileOutputStream("test.csv");
            str = "Hello World!\nThis is 4th method";
            fout.write(str.getBytes());
            fout.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
