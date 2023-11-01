package JavaClasses.class2;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        // Simple Assignment Operator (=)
        int a = 10; // Assign the value 10 to the variable 'a'
        System.out.println("a: " + a); // Output: 10

        // Add and Assign (+=) Operator
        int b = 5;
        b += 3; // Equivalent to b = b + 3
        System.out.println("b: " + b); // Output: 8

        // Subtract and Assign (-=) Operator
        int c = 15;
        c -= 7; // Equivalent to c = c - 7
        System.out.println("c: " + c); // Output: 8

        // Multiply and Assign (*=) Operator
        int d = 4;
        d *= 6; // Equivalent to d = d * 6
        System.out.println("d: " + d); // Output: 24

        // Divide and Assign (/=) Operator
        int e = 20;
        e /= 4; // Equivalent to e = e / 4
        System.out.println("e: " + e); // Output: 5

        // Modulus and Assign (%=) Operator
        int f = 17;
        f %= 3; // Equivalent to f = f % 3
        System.out.println("f: " + f); // Output: 2
    }
}
