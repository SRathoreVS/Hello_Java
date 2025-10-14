package basicOfJava;

public class Switch {
    public static void main(String[] args) {
        // SWITCH Statement

        // based on the value of N print days of the week
        int n = 7;

        // conditional if-else : Sunday
        if (n == 1)
            System.out.println("Monday");
        else if (n == 2)
            System.out.println("Tuesday");
        else if (n == 3)
            System.out.println("Wednesday");
        else if (n == 4)
            System.out.println("Thrusday");
        else if (n == 5)
            System.out.println("Friday");
        else if (n == 6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");

        // switch case : Sunday , once it matches the case it wont stop there it will
        // execute all the block code below it ,
        // so we use BREAK; to come out once matches the case

        // OLD Way of Switch (java 8)
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
                System.out.println("Thrusday");
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
            // default is for no matching case then use default
            default:
                System.out.println("Enter the valid date");
                break;
        }

        // New : why need to have break in btw. || and what if we want to return
        // something from switch as expression
        String day = "Monday";

        switch (day) {
            // case "Saturday", "Sunday":
            // System.out.println("6am");
            // break;
            // case "Monday":
            // System.out.println("8am");
            // break;

            // NEW without break : use ->(arrow)
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default ->
                System.out.println("7am");
        }

        String result = "";
        result = switch (day) {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };

        System.out.println(result);

        // instead dont want to use -> || use : with (yeild : keyword) and value
        String res = "";
        res = switch (day) {
            case "Saturday", "Sunday":
                yield "6am";
            case "Monday":
                yield "8am";
            default:
                yield "7am";
        };

        System.out.println(res);

    }
}
