package basicOfJava;

public class Loops {
    public static void main(String[] args) {
        // LOOPS : while,do-while,for
        // repeat multiple times ,re-iterate ||based on some condition

        // 1. While Loop : while(conditon){} , || if condition always true : infinite
        // while nested Loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Hi" + i);

            int j = 1;
            while (j <= 3) {
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }
        System.out.println(i); // 6

        // 2. do -while loop || want to run atleast once then do() | even if condition
        // is false

        int k = 6;
        do {
            System.out.println("Hi" + i); // Hi6
            i++;
        } while (k <= 5);

        // 3. FOR LOOP : || in while we did 3 things initialization , condition then
        // increament ||
        // here , we right all the things in 1 line
        for (int j = 1; j <= 5; j++) {
            System.out.println("Hi" + j);
        }
        for (int a = 5; a >= 1; a--) {
            System.out.println("Hello" + a);
        }
        // want 4 values
        for (int b = 0; b <= 3; b++) {
            System.out.println(b);
        }

        // no of days | every day 24hrs
        for (int d = 1; d <= 5; d++) {
            System.out.println("Day " + d);
            for (int h = 1; h <= 9; h++) {
                System.out.println(" " + (h + 8) + " - " + (h + 9));
            }
        }
    }
}

// which one to use in all 3 :
// no of iterations is known then - FOR Loop
// when no initial point - While Loop
// when the condition is false yet want to execute ops 1 time - DO-WHILE LOOP