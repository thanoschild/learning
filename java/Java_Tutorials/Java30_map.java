import java.util.HashMap;
import java.util.Map;

public class Java30_map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        // Map<String, Integer> students = new Hashtable<>(); // for syncronoised 
        students.put("sumeet", 85);
        students.put("sumeet2", 75);
        students.put("sumeet4", 65);
        students.put("sumeet3", 55);

        students.put("sumeet3", 83);

        System.out.println(students);

        for(String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}
