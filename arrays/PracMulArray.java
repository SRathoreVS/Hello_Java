package arrays;

public class PracMulArray {
    public static void main(String[] args) {
        int BigArr[][] = new int[5][6];

        // fill the random values in the array
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 5; j++) {
                BigArr[i][j] = (int) (Math.random() * 10);
            }
        }

        // will fetch the values from the array
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(BigArr[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop
        for (int ar[] : BigArr) {
            for (int a : ar) {
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
 
// 1 0 2 4 8 0 
// 8 2 5 4 5 2 
// 7 1 0 1 9 0 
// 5 4 7 8 1 0 
// 746883
// 102480
// 825452
// 710190
// 547810
