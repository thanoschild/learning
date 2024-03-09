import java.io.File;
import java.io.IOException;

public class Java39_fileCreate {
    public static void main(String[] args) {
        File file = new File("/Users/sumeet/Public/learning/java/Java_Tutorials/newFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
