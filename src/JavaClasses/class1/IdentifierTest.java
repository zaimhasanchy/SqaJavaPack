package JavaClasses.class1;

public class IdentifierTest {
    public static void main(String[] args) {
        int age = 30;
        String name = "John Doe";

        // Using identifiers in expressions
        double heightInMeters = 1.75;
        double weightInKilos = 70;
        double bmi = weightInKilos / (heightInMeters * heightInMeters);

        // Displaying the results using identifiers
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height (m): " + heightInMeters);
        System.out.println("Weight (kg): " + weightInKilos);
        System.out.println("BMI: " + bmi);
    }

    public void samplemethod(){
        System.out.println("this is sample method");
    }
}
