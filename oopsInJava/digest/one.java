package oopsInJava.digest;

public class one {
    public static void main(String[] args) {
        //1.parent class ANIMAL is a super class
        //2. Taking parent ANIMAL class reference and creating the CHILD Dog object
        //3. Subclass obj can be treated as instance of its super class
        //4. POLYMORPHISM
        Animal dog = new Dog();
        dog.makeSound();
    }
}
