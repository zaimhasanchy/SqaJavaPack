package JavaClasses.class2;

public class RelationalOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Equal to (==) operator
        boolean isEqual = num1 == num2;
        System.out.println("num1 == num2: " + isEqual); // Output: false

        // Not equal to (!=) operator
        boolean isNotEqual = num1 != num2;
        System.out.println("num1 != num2: " + isNotEqual); // Output: true

        // Greater than (>) operator
        boolean isGreaterThan = num1 > num2;
        System.out.println("num1 > num2: " + isGreaterThan); // Output: true

        // Less than (<) operator
        boolean isLessThan = num1 < num2;
        System.out.println("num1 < num2: " + isLessThan); // Output: false

        // Greater than or equal to (>=) operator
        boolean isGreaterThanOrEqual = num1 >= num2;
        System.out.println("num1 >= num2: " + isGreaterThanOrEqual); // Output: true

        // Less than or equal to (<=) operator
        boolean isLessThanOrEqual = num1 <= num2;
        System.out.println("num1 <= num2: " + isLessThanOrEqual); // Output: false
    }
}
