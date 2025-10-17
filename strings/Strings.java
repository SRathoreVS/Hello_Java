package strings;

public class Strings {
    public static void main(String[] args) {
        // what is String

        // String || definition starts with Cap S || so its a non-primitive Class type

        // whenever we work with class we create a new Object || with "new"

        String name1 = new String("Priyatam");

        System.out.println(name1);

        System.out.println("hello " + name1);

        // check char location
        System.out.println(name1.charAt(1)); // r

        // concat
        System.out.println(name1.concat("singh"));

        // this is more acceptable || bts it creates the object only
        String name = "Satyam";
        System.out.println(name);
    }
}
