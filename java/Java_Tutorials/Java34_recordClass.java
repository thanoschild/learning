// all the variable are private and final by defalult and you cannot change the value
// this class cannot extends any other class
// can implement inteface

record Alien (int id, String name) implements Cloneable { // it will create a cononical constructor
    
    static int num;
    // int age; // cannot create instance variable
    
    public Alien() {
        this(99, "no_name");
    }

    // public Alien(int id, String name) {
    //     if(id == 0) {
    //         throw new IllegalArgumentException("id cannot be 0");
    //     }
    //     this.id = id;
    //     this.name = name;
    // }

    public Alien {
        if(id == 0) {
            throw new IllegalArgumentException("id cannot be 0");
        }
    }

    public void show() {
        System.out.println("in show");
    }
}

public class Java34_recordClass {

    public static void main(String[] args) {
        Alien a1 = new Alien(1, "sumeet");
        Alien a2 = new Alien(2, "haldar");
        Alien a3 = new Alien();

        System.out.println(a1);
        System.out.println(a1.equals(a2));
        System.out.println(a3);

        System.out.println(a1.name());
    }
}
