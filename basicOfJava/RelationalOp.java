package basicOfJava;

public class RelationalOp {
    public static void main(String[] args) {
        // compare operator || relational operator ----
        // < | > | ==(compare) | != (not equal)
        // <= | >= |
        // always returns a Boolean

        int x = 6;
        int y = 7;
        int a = 8;
        int b = 8;

        double d1 = 8.5;
        double d2 = 7.2;

        // relational/compare ops
        boolean result = x > y;
        boolean res = a >= b;
        boolean notEq = a != b;
        boolean equal = a == b;

        // Logical Operator
        // AND(&) ---- OR(|) ---- NOT(!)
        // if any condition is true give TRUE ---> OR(||)
        // if all the condition is true then only give TRUE --> AND(&&)
        boolean andOp = x < y && a == b;
        boolean orOp = d1 > d2 || b > a;
        boolean notOp = a == b;

        // Outputs:-
        System.out.println(result); // false
        System.out.println(res); // true
        System.out.println(notEq); // false
        System.out.println(equal); // true
        System.out.println(andOp);// true
        System.out.println(orOp);// true
        System.out.println(!notOp);// false
    }
}
