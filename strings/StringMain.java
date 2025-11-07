package strings;

public class StringMain {
    public static void main(String[] args) {
//         int a = 1;
//         char c = 'a';
//         boolean isPassed = true;

        String name = "Satyam";
        System.out.println(name);

//      String address = new String("India");

        //string new reference (they will point to heap location) new strings
        String a = new String("ram");
        String b = new String("ram");
        System.out.println(a == b); //false || checking reference

        //because below will be fetched from String Pool
        String c = "ram";
        String d = "ram";
        System.out.println(c == d); //true || checking reference


        //creating different students
        Student stu1 = new Student();
        stu1.name = "Satyam Rathore";
        stu1.address = "India";
        stu1.rollNo = 18;
        stu1.standards = 4 ;
        System.out.println(stu1.address);


        //Methods : worker in String
        String name2 = "Priyatama";
        int length = name2.length();

        System.out.println(length); //5

        char c1 = name2.charAt(5);
        System.out.println(c1); //t

        String name3 = "Priyatama";
        String name4 = "priyatama";

        //== can not be used to check equality in non-primitive , == checks the reference

        //true
        System.out.println(name2.equals(name3));
        //false : casting of type changed
        System.out.println(name2.equals(name4));
        //true : to ignore the type casting
        System.out.println(name2.equalsIgnoreCase(name4));


        //COMPARE TO METHOD():
        String str1 = "remote";
        String str2 = "car";

        int i = str1.compareTo(str2);
        System.out.println(i); //15 : compare's the ASCII value r to c compared and returned

        //we have ignored case as well here to ignore casing as A to a
        String str3 = "satyam";
        String str4 = "Satyam";

        System.out.println(str3.compareToIgnoreCase(str4)); //0

        //SUB STRING: divide the string by choosing the index to have  a start from || if we need some part of that STRING
        String name5 = "Sat Pri";
        String substring = name5.substring(4);
        System.out.println(substring);

        //CASING to caps and Low
        //sat pri
        //SAT PRI
        String lowerCase = name5.toLowerCase();
        String upperCase = name5.toUpperCase();
        System.out.println(lowerCase);
        System.out.println(upperCase);

        //Extra space removal : TRIM()
        String age = "   twenty seven";
        System.out.println(age.trim());

        //REPLACE :
        String replace = age.replace("seven", "rathore");
        System.out.println(replace.trim());

        //CONTAINS:
        boolean s = age.contains("s");
        System.out.println(s);

        //ENDS WITH + STARTS WITH

        //isBlank() and isEmpty()
        String space = "   ";
        System.out.println(space.isBlank()); //true
        System.out.println(space.isEmpty()); //false

        //INDEX OF:
        int charOf = age.indexOf("t");
        System.out.println(charOf); //3

        //FORMAT: access from CLASS are || static method || %s - str ,, %d -- int
        String formattedStr = String.format("My name is %s and I am %d years old.", "John",25);
        System.out.println(formattedStr);

    }
}
