package JavaClasses.class6.DrawMainMethod;

public interface Drawable {

    int salary =5000;
    void draw();

    default void printMsg(){
        System.out.println("This is default method");
        printSomething();
    }

    static int cube (int x){
        return x * x * x;
    }

    private void printSomething(){
        System.out.println("this is private method");
    }
}
