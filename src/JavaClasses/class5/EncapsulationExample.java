package JavaClasses.class5;

class Student {
    // Private fields, only accessible within the class
    private String name;
    private int age;

    // Constructor to initialize the fields
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to access the name field
    public String getName() {
        return name;
    }

    // Setter method to modify the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to access the age field
    public int getAge() {
        return age;
    }

    // Setter method to modify the age field
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20);

        // Access and modify the object's properties using getter and setter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Bob");
        student.setAge(25);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}
