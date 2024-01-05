import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Java29_Set {
    public static void main(String[] args) {
        
        // doesn't allow duplicate element
        Set<Integer> nums = new HashSet<>(); 
        // Set<Integer> nums = new TreeSet<>();  // to store data in sorted order

        nums.add(44);
        nums.add(353);
        nums.add(423);
        nums.add(99);
        nums.add(1);

        System.out.println(nums);

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
