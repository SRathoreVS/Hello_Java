package oopsInJava.methods;

import oopsInJava.digest.Cat;

public class Methods {
    public static void main(String[] args) {
        int a  =2;
        int b =3;
        System.out.println("Sum :" + a+b);

        int[] array = {1,2,3,4,5,6,7,8};
        int ar1 = SumOfArray(array);

        int[] bArray = {3,5,68,3,6,3,2};
        int i = SumOfArray(bArray);

        System.out.println(ar1 + i);

        String string1 = "   satyam   ";
        String s = SpaceStr(string1);
        System.out.println(s);

        int i1 = SumOfNum(2, 4);
        System.out.println(i1);

        int i2 = SumOfNum(2, 4,9);
        System.out.println(i2);

        int x= 10;
        System.out.println(multiply(x)); //100
        System.out.println(x); //10

        Cat c = new Cat();
        c.name = "Meowww";
        Cat cat = getCatNameUpperCase(c);
        System.out.println(cat.name);

        System.out.println(sum2(2,3,4,5,6));

        System.out.println(isPrime(5));
        System.out.println(isPrime(2));
        System.out.println(isPrime(10));

    }

    public static int SumOfArray(int[] arr){
        int res = 0;
        for(int i : arr){
            res += i;
        }
        return res;
    }

    //String : trim out front and backspace and convert it to Uppercase
    private static String SpaceStr(String s){
        return s.trim().toUpperCase();
    }

    //sum of any two numbers
    private static int SumOfNum(int a,int b){
        return a + b;
    }

    //3 params sum
    //basically this is known as METHOD Overloading : when name of method return type is same but the parameter is bit different .
    private static int SumOfNum(int a,int b, int c){
        return a + b + c;
    }

    //when method name is same and parameter Type is different is also METHOD OVERLOADING || METHOD SIGNATURE

    public static int multiply(int x){
        return  x * 10;
    }

    public static Cat getCatNameUpperCase(Cat cat){
        cat.name = cat.name.toUpperCase();
        return cat;
    }

    //if we have the multiple params to pass , so we can use ... operator , will  be treated as array , variable arguments
    public static int sum2(int...s){
        int res1 = 0;
        for(int i : s) {
            res1 += i;
        }
        return res1;
    }

    //check a method , whether a num is Prime or Not
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res++;
            }
        }
        return res == 2; // Prime has exactly 2 divisors: 1 and itself
    }

}
