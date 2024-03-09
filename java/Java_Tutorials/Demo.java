import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Demo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(4, 6, 8, 9));

        List<Integer> ans = arr.stream()
                               .filter(n -> n%2 == 0)
                               .collect(Collectors.toList());

        for(int n : ans) {
            System.out.println(n);
        }
    }
}