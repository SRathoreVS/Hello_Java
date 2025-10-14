package concepts;

class Calculator {
    public double calculate(double n1, double n2, char op) {
        return switch (op) {
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n2 != 0 ? n1 / n2 : Double.NaN;
            default -> {
                System.out.println("Enter correct operator");
                yield 0;
            }
        };
    }
}

public class TestObj {
    public static void main(String[] args) {
        double n1 = 5;
        double n2 = 6;
        char op = '/';

        Calculator calc = new Calculator();
        double result = calc.calculate(n1, n2, op);

        System.out.println("Result: " + result);
    }
}
