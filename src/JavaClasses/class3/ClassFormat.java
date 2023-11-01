package JavaClasses.class3;

public class ClassFormat {

    String name;

    public void printsomething(){
        System.out.println("this is a method");
    }

    public static void main(String[] args) {
        ClassFormat test =new ClassFormat();
        test.name="hasan";
        test.printsomething();
    }
}
