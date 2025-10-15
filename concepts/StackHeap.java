package concepts;

// This class represents an object whose data is stored in the Heap
class InnerStackHeap {
    // Instance variable: stored in the Heap as part of the object
    int num = 5;

    // Method: code is in Method Area; parameters and local variables are on the
    // Stack
    public int add(int n1, int n2) {
        // n1 and n2 are local variables: stored on the Stack
        System.out.println(num); // Accessing instance variable from the Heap
        return n1 + n2;
    }
}

public class StackHeap {

    public static void main(String[] args) {
        // num1 and num2 are local variables: stored on the Stack
        int num1 = 4;
        int num2 = 5;

        // 'memory' is a reference variable on the Stack, pointing to an object in the
        // Heap
        InnerStackHeap memory = new InnerStackHeap();

        // Calling add(): a new Stack frame is created for this method call
        int resAdd = memory.add(num1, num2); // resAdd is also on the Stack

        // Output the result
        System.out.println(resAdd);
    }
}

// the other object created is separate from the original object change of
// properties in 1 wont affect the other