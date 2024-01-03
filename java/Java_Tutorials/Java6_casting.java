public class Java6_casting {
    public static void main(String[] args) {
        int a = 2452;
        byte k = (byte) a;   // casting
        System.out.println(k);

        float f = 5.6f;
        int t = (int)f;      // casting
        System.out.println(t);

        byte x = 10, y = 39;
        int result = x*y;
        System.out.println(result);  // type promotion
    }
}
