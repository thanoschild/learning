import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
    }
}

public class Java31_comparator {
    public static void main(String[] args) {

        // to sort with the last digit of number
        Comparator<Integer> myComparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int a1 = a % 10;
                int b1 = b % 10;

                if (a1 > b1)
                    return 1;
                return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(34);
        nums.add(721);
        nums.add(73);
        nums.add(949);
        nums.add(34);
        nums.add(334);

        Collections.sort(nums, (a, b) -> b%10 - a%10);
        System.out.println(nums);  // [949, 34, 34, 334, 73, 721]

        Comparator<Student> myComparator2 = (Student a, Student b) -> {
            if (a.marks == b.marks && a.rollNo > b.rollNo)
                return 1;
            if (a.marks < b.marks)
                return 1;
            return -1;
        };

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("sumeet", 21, 83),
                new Student("Varun", 53, 99),
                new Student("Tarun", 72, 83),
                new Student("Karun", 99, 28),
                new Student("Marun", 7, 83)));

        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, myComparator2);
        System.out.println();
        System.out.println();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
