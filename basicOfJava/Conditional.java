package basicOfJava;

public class Conditional {
    public static void main(String[] args) {
        // CONDITIONAL STATEMENT
        // if - else
        int x = 8;
        int y = 11;
        double z = 13.7;

        // if-else
        if (x > 10) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        } // bye

        // if else-if else
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        } // 13.7

        // TERNARY OPERATOR ? and :
        int ab = 4;
        int result = 0;

        // if-else
        if (ab % 2 == 0) {
            result = 10;
            System.out.println("even");
        } else {
            result = 11;
            System.out.println("odd");
        }
        System.out.println(result); // 10

        // Ternary ? and :
        result = ab % 3 == 0 ? 10 : 20;
        System.out.println(result); // 20
    }
}
