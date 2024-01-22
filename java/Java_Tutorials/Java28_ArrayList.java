/*
 * Collection
 *  - List
 *  - Queue
 *  - Set
 * 
 *  List:
 *  - ArrayList
 *  - LinkedList
 * 
 *  Queue
 *  - Deque
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java28_ArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(1);

        System.out.println(nums);

        for(int n : nums) System.out.println(n);
        Collections.sort(nums);

        // for(int n : nums) System.out.println(n);

        nums.forEach(n -> System.out.println(n));
    }
}
