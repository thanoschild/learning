import java.io.File;

public class Java38_filepermission {
    public static void main(String[] args) {
        File file = new File("/Users/sumeet/Public/learning/java/Java_Tutorials/Java30_map.java");

        boolean exists = file.exists();

        if(exists == true) {
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        }
        else {
            System.out.println("file not found");
        }
    }
}
