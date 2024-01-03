class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class Java12_arrays {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 2, 0};
        arr[4] = 9;

        int[][] nums = new int[5][5];
        int nums2[][] = new int[5][5];

        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                nums[i][j] = (int)(Math.random() * 10);
                nums2[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        int[][] jagged = new int[3][];  // jagged array;
        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[4];

        for(int i = 0; i<jagged.length; i++) {
            for(int j = 0; j<jagged[i].length; j++) {
                jagged[i][j] = (int)(Math.random() * 100);
            }
        }

        // int[][][] threeD = new int[5][5][5]; // 3d array

        Student s1 = new Student("sumeet", 21);
        Student s2 = new Student("sumeet", 21);
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s1));

        // Student[] students = new Student[5]; // array of objects

    }
}
