package JavaClasses.class5;

public class MainVariableTypesExample {
    public static void main(String[] args) {
        VariableTypesExample example = new VariableTypesExample();
        System.out.println("Static variable: " + VariableTypesExample.staticVar);
        System.out.println("Instance variable: " + example.instanceVar);
        example.methodWithLocalVariable();
    }
}
