package strings;

public class TypesOfStr {
    public static void main(String[] args) {
        // Types : MUTABLE | IMMUTABLE
        String name = "Satyam ";
        name = name + "rathore";

        System.out.println("hello " + name);
        // hello Satyam rathore

        // if the String values are same , it wont create a separate object it uses the
        // reference of the initial obj
        String s1 = "SATYAM";
        String s2 = "SATYAM";

        // here s1,s2 are in stack || and its value for S1 its stored in HEAP : [STRING
        // CONSTANT POOL] where all the strings values are stored , so for s1 : "SATYAM"
        // is stored

        // and any address is assigned to s1 in stack as 101 || then agin it checks for
        // s2 is there any "SATYAM" in heap

        // yes its already there from s1 , so basically it wont create a new obj and
        // utilizes the same reference with 101 address.

        // STRING CONSTANT POOL : so string is constant cannot be changed ,
        // so when we do this :
        name = name + "rathore";

        // this will have its initail name = "satyam" object || and again create a new
        // object with "satyam Rathore" as updated name variable .

        // and older reference name obj will move to Garbage collections

        System.out.println("hello " + name);

        // by default Strings are Immutable .

    }
}
