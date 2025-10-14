package concepts;

// Computer class with some behaviors (methods)
class Computer {
    // Method that does not return anything (void)
    public void playMusic() {
        System.out.println("Music Playing");
    }

    // Method that returns a String based on the cost
    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

// Calculator class with overloaded add methods
class Calculator {
    // Add three integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Add two integers (method overloading: same name, different parameters)
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Add a double and an integer (method overloading)
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

// Main class where execution starts
public class MethodsObj {
    public static void main(String[] args) {
        // Create an instance of Computer
        Computer comp = new Computer();
        comp.playMusic(); // Calls playMusic method

        String str = comp.getMeAPen(2); // Calls getMeAPen with cost 2
        System.out.println(str); // Prints the result ("Nothing")

        // Create an instance of Calculator
        Calculator calc = new Calculator();

        int res = calc.add(4, 6); // Calls add method with two integers
        System.out.println(res); // Prints the result (10)
    }
}
