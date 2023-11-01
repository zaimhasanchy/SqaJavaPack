package JavaClasses.class4;

public class ContinueStatementExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration at i = " + i);
                continue; // Skip the current iteration when i is 3
            }
            System.out.println("i = " + i);
        }
    }
}
