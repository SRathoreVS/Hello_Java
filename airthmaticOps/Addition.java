package airthmaticOps;

public class Addition {
    public static void main(String[] args) {
        int a = 5;
        double b = 10.1;
        double total = a + b ;
        System.out.println(total);

        //literal
        double lit = total + 11.76;
        System.out.println(lit);

        float f = 12.2f;
        long l = 22343;
        float fL = f + l;
        System.out.println(fL);

        //more precision in bigger values
        long lo = 2286840;
        long totalL = lo * 234355666 ;
        System.out.println(totalL); //535933911235440

        //precision loss
//        int in = 2286840;
//        long totalLoss = in * 234355666 ;
//        System.out.println(totalLoss); //-697894032

//        division
        double d = 10;
        int div = 3;
        double quotient = d / div;
        System.out.println(quotient);

//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at airthmaticOps.Addition.main(Addition.java:37)
//        int a1 = 2;
//        int b1 = a1 -2;
//        int c = a1/b1;


//      OPERATOR PRECEDENCE - SAME AS BODMAS , just from LEFT SIDE
        int result = 5 + 3 * 2;
        System.out.println(result);

        int num1 = 10 , num2 = 5;
        int result2 = num1/num2 * 3;
        System.out.println(result2);

        int aa = 10;
        aa = aa + 1;
        System.out.println(aa);

//        SHORT HAND
        int bb = 10;
        bb += 1 ;
        System.out.println(bb);



    }
}
