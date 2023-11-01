public class AllTypeModifierExample {
    // Public variable can be accessed from anywhere
    public String name;

    // Private variable can only be accessed within the same class
    private int salary;

    // Protected variable can be accessed within the same package and subclasses
    protected int employeeID;

    // Default (package-private) variable can be accessed within the same package
    int age;

    // Public method with a real-time example
    public void greet() {
        System.out.println("Hello, my name is " + name + ".");
    }

    // Private method with a real-time example
    private void calculateBonus() {
        int bonus = salary * 10 / 100;
        System.out.println("Bonus calculated: $" + bonus);
    }

    // Protected method with a real-time example
    protected void assignEmployeeID(int id) {
        this.employeeID = id;
        System.out.println("Employee ID assigned: " + employeeID);
    }

    // Default (package-private) method with a real-time example
    void setAge(int age) {
        this.age = age;
        System.out.println("Age set to: " + age);
    }

    // Non void method with with parameter
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        AllTypeModifierExample emp = new AllTypeModifierExample();
        emp.name = "John";
        emp.salary = 50000; // Not recommended, but can be done within the same class
        emp.age = 30;

        emp.greet();
        emp.calculateBonus(); // Cannot be accessed outside the class
        emp.assignEmployeeID(1001);
        emp.setAge(31);

        int a = 5;
        int b = 7;
        int result = addNumbers(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
