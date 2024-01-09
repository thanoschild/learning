@FunctionalInterface
interface B {
    int add(int a, int b);
}

enum Names{
    Sumeet(12, 33), Amit(13, 44), Rohit(14, 55);

    private int id;
    private int age;

    Names(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}

public class Demo {
    public static void main(String[] args) {
        for(Names obj : Names.values()) {
            System.out.println(obj + " Age: " + obj.getAge());
            System.out.println("ID: " + obj.getId());
        }
    }
}
