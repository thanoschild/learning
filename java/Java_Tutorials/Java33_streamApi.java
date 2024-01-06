import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java33_streamApi {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 8, 9, 2, 7, 6));

        Consumer<Integer> con = n -> {
            System.out.println(n);
        };
        nums.forEach(con);

        Stream<Integer> s1 = nums.stream();   // stream can only be used once
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);  // filters all the even value
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // we can write everyting in one line
        result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);


        // behind the scene of all this lambda expresion
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };


        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
            public Integer apply(Integer n) {
                return n * 2;
            }
        };


        result = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);
    }
}
