package JavaClasses.class4;

public class breakSteatementExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Loop terminated at i = " + i);
                break; // Exit the loop when i is 6
            }
            System.out.println("i = " + i);
        }
    }
}
