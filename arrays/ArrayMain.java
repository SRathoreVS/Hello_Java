package arrays;

public class ArrayMain {
    public static void main(String[] args) {

        //ARRAY
        int[] array = {1,2,3};

        //SIZE: 10 || new reference variable
        int[] integerArray = new int[10];

        //TRAVERSING an ARRAY
        for (int i=0; i<=integerArray.length -1;i++){
            System.out.println(integerArray[i]);
        }

        //FOR EACH loop : not for arrays but for the collections , and here i : represents the value not the index
        for (int i:array){
            System.out.println(i);
        }

        //SEARCH An ELEMENT IN AN ARRAY :---
        //find 55 is there or not
        int[] arr2 = {1,3,5,55,7,-2};

        //1.
        for (int v = 0; v < arr2.length; v++) {
            if (arr2[v] == 55) {
                System.out.println("55 is there");
            }
          //  else  System.out.println("not there");
        }

        //find maximum elements
        int[] arr3 = new int[5];
        arr3[0] = 2;
        arr3[1] = 12;
        arr3[2] = 3432;
        arr3[3] = -34;
        arr3[4] = 74;

        int res = Integer.MIN_VALUE; //-Infinity smallest

        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] > res){
                res = arr3[i];
            }
        }
        System.out.println(res);

        //REVERSE print the array
        int[] revArr = {1,2,3,4,5,6,7};

        for (int i = revArr.length-1; i >= 0; i--) {
            System.out.println(revArr[i]);
        }

        //sum of ARRAY
        int[] arrSum = {-2,4,55,-4,11,-55,-11,2,22};
        int sum = 0;
        for (int i = 0; i < arrSum.length; i++) {
            sum += arrSum[i];
        }
            System.out.println(sum);

        for (int i: arrSum){
            sum += i;
        }
        System.out.println(sum);

        //MULTI-DIMENSIONAL ARRAY
        int[][] mulArray = new int[3][3] ;
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[1][1]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //JAGGED ARRAY || array of different length
        //when size is not know
        //char[][] achar = new char[2][];
        char[][] charArray = {
                {'a','b'},{'c','d','z'},{'e','f'}
        };

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
