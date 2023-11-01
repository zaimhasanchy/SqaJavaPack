package JavaClasses.class4;

public class NestedIfExample {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {
            System.out.println("You are old enough to vote.");

            if (hasLicense) {
                System.out.println("You can also drive.");
            } else {
                System.out.println("You are eligible to vote, but you can't drive without a license.");
            }
        } else {
            System.out.println("You are too young to vote.");
        }
    }
}
