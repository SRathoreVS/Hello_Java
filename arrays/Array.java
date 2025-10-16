package arrays;

public class Array {
    public static void main(String[] args) {
        // need of an Array
        // what if we have multiple variables
        // int a = 4;
        // int b = 5;
        // int c = 9;
        // ........

        // we use array to store multiple values in 1 variable
        int nums[] = { 4, 5, 9 };
        // changing the values in arrays using indexes
        nums[1] = 6;
        // fetch according to indexes
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        // what if we want the array to be dynamic || here int[4] is size specified ||
        // default all values will be 0

        int arr[] = new int[4];
        System.out.println(arr[0]); // 0
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        // this above is not good way same lines multiple times

        // 2. by using loop
        for (int i = 0; i <= 3; i++) {
            System.out.println(arr[i]); 
        }

    }
}
