import java.io.File;

public class Java37_filedelete {
    public static void main(String[] args) {
        File file = new File("/Users/sumeet/Public/learning/java/Java_Tutorials/text.txt");

        if(file.delete()) {
            System.out.println("file is deleted");
        }
        else {
            System.out.println("Not able to delete file");
        }
    }
}
