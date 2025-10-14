package basicOfJava;
// for temporary data storage Variable is used like STRONGLY TYPED LANGUAGE

// number [(1,2,3,4 --> int || integer) ,, (0.1,0.4,4.8 --> float)]

// Data Types 
// 1. Primitive ==> 4[integers(byte,short,int,long),float(double,float),characters,boolean]

// integers(byte(-128<->127),short=>2byte,int=>4byte,long=>8byte) -----> ranges for storing val

// float(double=>8bytes,float=>4bytes) || default is double for better presecion || for float use explicit 'f' as 2.56f

// character=>2bytes || UNICODE (all the characters across globe) || char c = 'K' || only single character accepted in ''

// boolean=>true || false  |||| bool b = true 

class Variable {
    public static void main(String[] args) {
        // = as assignment ops
        // int num = 3;
        // int num1 = 5;
        // int num2 = 9;
        // double marks = 10.8;
        // int result = num+ num1 + num2;
        // int num = 565;
        // binary => 0b101
        // hexadecimal => 0x101
        // very big num => 12e

        // byte by = 127;
        // short sh = 558;
        // long ln = 8765l;

        // float fl = 5.8f;
        // double dob = 5.8;
        // char c = 'K'; //literals
        // boolean bool = true;

        // type conversion and casting
        // byte b = 127;
        // int a = 12 ;
        // b=a -> b=(byte)a; ==> casting
        // a=b ==> conversion
        // float f = 5.6f;
        // int x = (int)f ; --> cut the point values

        // if we assign values bigger than there ranges to other data type , it will use
        // MODULAR
        // byte b = 127; (-128-- 127 ==> range(256))
        // int a = 257 ;
        byte b = 127;
        int a = 257;
        // byte k = a; //Type mismatch: cannot convert from int to byte
        byte k = (byte) a; // 1 divide by range

        float f = 5.6f;
        int t = (int) f; // 1

        // type promotion
        byte a1 = 10;
        byte a2 = 30;

        int result = a * b; // byte values promoted to int values
        System.out.println(k);

    }
}
