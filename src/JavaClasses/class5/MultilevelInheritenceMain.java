package JavaClasses.class5;

// Base class: Calculator
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

// Subclass: AdvancedCalculator
class AdvancedCalculator extends Calculator{
    int multiply(int a, int b){
        return a * b;
    }

    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}

// Subclass: ScientificCalculator
class ScientificCalculator extends AdvancedCalculator {
    double squareRoot(double num) {
        return Math.sqrt(num);
    }

    double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

public class MultilevelInheritenceMain {
    public static void main(String[] args) {
        ScientificCalculator sciCalc = new ScientificCalculator();

        int result1=sciCalc.add(10,20);
        int result2=sciCalc.subtract(20,10);
        double result3=sciCalc.multiply(10,20);
        double result4=sciCalc.divide(10,0);
        double result5=sciCalc.power(2,3);
        double result6= sciCalc.squareRoot(9.0);

        System.out.println("Result 1 (10 +20) : " + result1);
        System.out.println("Result 2 (20 - 10): " + result2);
        System.out.println("Result 3 (10 * 20) : " + result3);
        System.out.println("Result 4 (10 / 0) : " + result4);
        System.out.println("Result 5 power(2,3) : " + result5);
        System.out.println("Result 6 sqrtRoot(9) : " + result6);

    }
}
