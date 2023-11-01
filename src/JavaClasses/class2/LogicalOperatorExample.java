package JavaClasses.class2;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&) operator
        boolean resultAND = a && b;
        System.out.println("a && b: " + resultAND); // Output: false

        // Logical OR (||) operator
        boolean resultOR = a || b;
        System.out.println("a || b: " + resultOR); // Output: true

        // Logical NOT (!) operator
        boolean resultNOTA = !a;
        boolean resultNOTB = !b;
        System.out.println("!a: " + resultNOTA); // Output: false
        System.out.println("!b: " + resultNOTB); // Output: true

        // Combining logical operators
        boolean x = true;
        boolean y = false;
        boolean z = true;

        boolean resultCombination = (x && y) || (z && !y);
        System.out.println("(x && y) || (z && !y): " + resultCombination); // Output: true
    }
}
