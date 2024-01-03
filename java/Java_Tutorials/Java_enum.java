// In Java, an enum, short for enumeration, is a special
// data type that is used to define a set of constant values

enum Status{
   Runnung, Failed, Pending, Sucess;
}


public class Java_enum {
    public static void main(String[] args) {
    
        Status s = Status.Sucess;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] arr = Status.values();

        for(Status val : arr) {
            System.out.println(val);
        }
    }
}
