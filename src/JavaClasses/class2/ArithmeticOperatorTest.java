package JavaClasses.class2;

public class ArithmeticOperatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;

        // Addition (+) operator
        int sum = num1 + num2;
        System.out.println("Sum: " + sum); // Output: 14

        // Subtraction (-) operator
        int difference = num1 - num2;
        System.out.println("Difference: " + difference); // Output: 6

        // Multiplication (*) operator
        int product = num1 * num2;
        System.out.println("Product: " + product); // Output: 40

        // Division (/) operator
        int quotient = num1 / num2;
        System.out.println("Quotient: " + quotient); // Output: 2

        // Modulus (%) operator (remainder)
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder); // Output: 2

        // Division with floating-point result
        double num3 = 10.0;
        double num4 = 4.0;
        double result = num3 / num4;
        System.out.println("Result: " + result); // Output: 2.5
    }
}
