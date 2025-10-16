package arrays;

class MultiArray {
    public static void main(String[] args) {
        // Multi-dimensional Array
        // multiple arrays in 1 big array || array inside of the array
        // [] : 1 array || [][] : array of Array

        // -------------
        // in nums[big array] : we have 3 small arrays as [n1][n2][n3] , lets say all
        // having 4 elements in each ,,,,,
        // ---------------
        // so it will be like :
        // int nums[][] = new int[(3) no.of arrays][size of array : 4]

        // how to get the values : 1st index of big array then of that one selected from
        // that selected index;

        int nums[][] = new int[3][4];

        // generate the random values in the array

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(nums[i][j]);
            }
        }
        // enhanced for loop
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }

}

// 8
// 6
// 6
// 6
// 0
// 1
// 8
// 2
// 3
// 9
// 0
// 6
// 8 6 6 6
// 0 1 8 2
// 3 9 0 6