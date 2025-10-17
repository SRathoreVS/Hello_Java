package arrays;

public class ThreeDarrays {
    public static void main(String[] args) {
        // 3-D arrays
        // everytime you want a multi dimensional array just increase one array
        // its like array inside array inside array

        int nums[][][] = new int[3][4][5];

        // fill the values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        // loop over the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    System.out.print(nums[i][j][k]);
                }
                System.out.println("");
            }
        }
    }
}
// 05375
// 70562
// 82416
// 19423
// 97688
// 65072
// 43135
// 26076
// 38706
// 69470
// 07147
// 17322