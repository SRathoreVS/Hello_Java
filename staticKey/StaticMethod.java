package staticKey;

class Mobile {
    String brand;
    int price;
    static String name;

    // static block to initialize static variable,
    // irrespective of how many objects we create static block will be executed only
    // once
    static {
        name = "Phone";
        System.out.println("in static block");

    }

    // here we didnot mention the static keyword , so is a instance method
    public void show() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
    }

    // if we want to instantiate the static variable we can do it inside constructor
    // also
    public Mobile() {
        brand = " ";
        price = 200;
        System.out.println("in constructor");
    }

    // with static keyword
    // when we try to access non static members inside static method it will give
    // error, as we see above String brand and int price are non static members
    //
    public static void show1(Mobile m) {
        System.out.println("Brand: " + m.brand + ", Price: " + m.price + ", Name: " + name);
    }
}

public class StaticMethod {
    // if main is static method it can access only static members directly
    // to access non static members we need to create object of the class
    // so to call main we do not need to create object of the class
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1000;
        Mobile.name = "iPhone";
        m1.show(); // calling instance method by creating object

        // Mobile.show(); // calling static method without creating object
        // Cannot make a static reference to the non-static method show() from the type
        // Mobile
        Mobile.show1(m1);

        Mobile m2 = new Mobile();
        m2.show();

    }
}
// 1st class loads --> then object is created --> constructor is called
// static block is executed when class is loaded only once
// if we dont create any object static block will be executed when we access any
// static member
// Class.forName("staticKey.Mobile") --> this will load the class and execute