package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        // For each loop : enhanced version of FOR LOOP
        int nums[] = new int[4];

        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 7;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // iterate through all the values but give me the VALUE not index but VALUE 1 at
        // a time
        // from this nums :: give me 1 value at a time

        for (int n : nums) {
            System.out.println(n);
        }

    }
}
