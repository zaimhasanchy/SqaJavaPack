package JavaClasses.class2;

public class UniaryOperatorTest {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Increment and Decrement Operators
        x++; // Increment x by 1
        y--; // Decrement y by 1

        System.out.println("x after increment: " + x); // Output: 11
        System.out.println("y after decrement: " + y); // Output: 4

        int m = 10;
        int n = 5;

        System.out.println("x after increment: " + m++); // Output: 10
        System.out.println("x after increment: " + m++); // Output: 11
        System.out.println("x after increment: " + m); // Output: 12

        System.out.println("x after increment: " + n--); // Output: 5
        System.out.println("x after increment: " + n--);// Output: 4
        System.out.println("x after increment: " + n); // Output: 3

        // Unary Plus and Unary Minus Operators
        int a = 7;
        int b = -a; // b is assigned the negation of a

        System.out.println("a: " + a); // Output: 7
        System.out.println("b (after unary minus): " + b); // Output: -7

        // Pre-increment and Pre-decrement
        int num = 5;
        int result1 = ++num; // Pre-increment: increment num by 1, then assign the value to result1
        int result2 = --num; // Pre-decrement: decrement num by 1, then assign the value to result2

        System.out.println("num: " + num);       // Output: 5
        System.out.println("result1: " + result1); // Output: 6
        System.out.println("result2: " + result2); // Output: 5
    }
}
