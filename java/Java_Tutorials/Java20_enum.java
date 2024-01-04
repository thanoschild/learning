// In Java, an enum, short for enumeration, is a special
// data type that is used to define a set of constant values

enum Status{
   Queued, Running, Failed, Sucess, Blocked, Waiting;
}

enum Laptop {
    Mackbook(2999), Hp(2889), Lenevo(2779), Microsoft(2669), Asus;

    private int price;

    private Laptop() {
        price = 599;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Java20_enum {
    public static void main(String[] args) {
    
        Status s = Status.Blocked;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] arr = Status.values();

        for(Status val : arr) {
            System.out.println(val);
        }


        Status s1 = Status.Running;
        switch (s1) {
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try again");
            default -> System.out.println("Done");
        }


        Laptop lap = Laptop.Mackbook;
        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lp : Laptop.values()) {
            System.out.println(lp + " : " + lp.getPrice());
        }
    }
}
