public class Java13_string {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Sumeet");
        System.out.println(s.capacity());
        s.append(" Haldar");
        s.insert(0, "Hi ");
        System.out.println(s);
    }
}
