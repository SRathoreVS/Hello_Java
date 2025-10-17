package arrays;

public class DiffSizeMulArray {
    public static void main(String[] args) {
        // i dont know no. of column i have in big Array : JAGGED ARRAY
        // we define how many arrays we have but columns are not specified

        // JAGGED
        int BigArr[][] = new int[3][];

        BigArr[0] = new int[3]; // 3 size
        BigArr[1] = new int[4];
        BigArr[2] = new int[2];

        // assign values to array
        for (int i = 0; i < BigArr.length; i++) {
            for (int j = 0; j < BigArr[i].length; j++) {
                BigArr[i][j] = (int) (Math.random() * 10);
            }
        }

        // loop over the JAGGED arrays
        for (int i = 0; i < BigArr.length; i++) {
            for (int j = 0; j < BigArr[i].length; j++) {
                System.out.print(BigArr[i][j]);
            }
            System.out.println("");
            // 097
            // 7169
            // 46
        }

    }
}
