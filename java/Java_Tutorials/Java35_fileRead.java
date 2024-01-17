import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Java35_fileRead {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sumeet/Public/learning/java/Java_Tutorials/data.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s.equals("aman")) continue;
            System.out.println(s);
        }
        sc.close();
        System.out.println();

        /*
         * using FileReader
         */
        FileReader fr = new FileReader("/Users/sumeet/Public/learning/java/Java_Tutorials/data.csv");
        int i;
        String str = "";
        while((i = fr.read()) != -1) {
            char c = (char) i;
            str += c;
        }
        System.out.println(str);
        fr.close();
        System.out.println();
        

        /*
         * using bufferedReader
         */
        fr = new FileReader("/Users/sumeet/Public/learning/java/Java_Tutorials/data.csv");
        String line;
        BufferedReader br = new BufferedReader(fr);
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        System.out.println();

        /*
         * using fileInputStream
         */
        FileInputStream fin = new FileInputStream("data.txt");
        int ch;
        String ans = "";
        while((ch = fin.read()) != -1) {
            char c = (char) ch;
            ans += c;
        }
        System.out.println(ans);
        fin.close();
     }
}
