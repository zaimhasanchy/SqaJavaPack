package JavaClasses.class5;

public class VariableTypeExampleWithNoMainClass {
    // Static variable
    static int staticVar = 10;

    // Instance variable
    int instanceVar = 20;

    public void methodWithLocalVariable() {
        // Local variable within a method
        int localVar = 30;
        System.out.println("Local variable: " + localVar);
    }

    public void instanceMethod() {
        // Access and modify instance variables
        instanceVar++;
        System.out.println("Modified instance variable: " + instanceVar);
    }

    public static void staticMethod() {
        // Access static variable within a static method
        System.out.println("Static variable from static method: " + staticVar);
    }

    // Constructor
    public VariableTypeExampleWithNoMainClass() {
        System.out.println("Constructor called.");
    }

    public static void main(String[] args) {
        staticMethod();
        VariableTypeExampleWithNoMainClass var = new VariableTypeExampleWithNoMainClass();
        var.instanceMethod();

    }
}
