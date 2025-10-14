package basicOfJava;

public class Operators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        // Add operator
        int resultAdd = num1 + num2;
        // subs ops
        int resultSub = num1 - num2;
        // divide
        int resultdiv = num1 / num2;
        // modular(remainder)
        int resultMod = num1 % num2;

        // num1 = num1 +2 ;
        // num1 *= 2;
        num1 += 2;
        // num1 += 1; || num1++ (post -increament) || num1-- (decreament)
        // ++num1 ==> (pre-increament)

        // int res = ++num1; //10 fetch the value then increamnet
        // int res = num1++; //9 increament 1st then fetch the value
        System.out.println();
    }
}
