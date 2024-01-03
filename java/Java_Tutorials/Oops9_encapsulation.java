// bundling of data (attributes) and the methods (functions)
// that operate on the data into a single unit known as a class

class Human {
    private int age;
    private String name;

    Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    String getName() {   // package private
        return name;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Oops9_encapsulation {
    public static void main(String[] args) {
        Human obj = new Human("sumeet", 34);
        System.out.println(obj.getAge());

    }
}
