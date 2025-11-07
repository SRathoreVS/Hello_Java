package concepts;

//design ,Blueprint
class Calculator1 {

    int a;

    public int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

public class ClassAndObj {
    // Java is Object oriented programming
    // an Object has 2 things : 1. some properties 2.and some action it does
    // designing of class is more imp
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;

        int result = num1 + num2;
        System.out.println(result);

        // how to call the method
        // create the instance , Object create using NEW keyword
        // it a variable || reference variable
        Calculator calc = new Calculator();

        // call
        int result2 = calc.addition(num1, num2); // 9
        System.out.println(result2);// in add || 0
    }
}

// Object - properties and behaviour

// if you want to create object , you need to create the Class .
// class will act as Blueprint
// |
// then converted to byte Code
// |
// then send to JVM
// |
// we get the object