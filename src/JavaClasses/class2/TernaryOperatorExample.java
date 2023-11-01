package JavaClasses.class2;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Using the ternary operator to find the maximum of two numbers
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum number is: " + max); // Output: 10

        // Using the ternary operator to determine if a number is even or odd
        int number = 7;
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result); // Output: 7 is odd
    }
}
