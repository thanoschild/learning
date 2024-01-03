// Lambda Expressions implement the only abstract function and therefore 
// implement functional interfaces

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java15_lambda {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // one option
        List<Integer> result = new ArrayList<>();
        arr.forEach(n -> {
            int val = n * 3;
            result.add(val);
            System.out.println(val);
        });

        // second option
        List<Integer> result2 = arr.stream()
                                   .map(n -> n * 3)
                                   .collect(Collectors.toList());
        System.out.println(result2);


        // lambda function on HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        hashMap.forEach((key, value) -> {
            int newValue = value * 5;
            hashMap.put(key, newValue);
        });
        System.out.println(hashMap);
    }
}
