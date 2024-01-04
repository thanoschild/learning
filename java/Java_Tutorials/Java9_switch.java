public class Java9_switch {
    public static void main(String[] args) {
        int n = 61;

        // normal switch
        switch (n) {    
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }

        // update version of switch and work in java12 and above
        String day = "Monday";  
        switch (day) {
            case "Sunday", "Saturday" -> System.out.println("set alarm at 6am");
            case "Monday" -> System.out.println("set alarm at 12pm");
            default -> System.out.println("set alarm at 7am");
        }

        // another update version of switch
        day = "Sunday";
        String result = switch (day) {         
            case "Sunday", "Saturday" -> "6am";
            case "Monday" -> "12pm";
            default -> "7am";
        };
        System.out.println("Alarm at: " + result);

        // another update version of switch
        day = "Wed";
        String ans = switch (day) {         
            case "Sunday", "Saturday": yield "6am";
            case "Monday": yield "12pm";
            default: yield "7am";
        };
        System.out.println("Alarm at: " + ans);
    }
}
