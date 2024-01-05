/*
 * if don't want to use comparator while sorting user define data type 
 * then we can implement comparable interface and define the compareTo method
 * in the class
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student that) {
        if (this.marks == that.marks && this.rollNo > that.rollNo)
            return 1;
        if (this.marks < that.marks)
            return 1;
        return -1;
    }
}

public class Java32_comparable {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("sumit", 21, 83),
                new Student("Varun", 53, 99),
                new Student("Tarun", 72, 83),
                new Student("Karun", 99, 28),
                new Student("Marun", 17, 83));

        for(Student s : students) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        Collections.sort(students);

        for(Student s : students) {
            System.out.println(s);
        }
    }
}
