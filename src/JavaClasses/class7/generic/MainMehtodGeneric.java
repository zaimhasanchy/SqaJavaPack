package JavaClasses.class7.generic;

public class MainMehtodGeneric {
    public static void main(String[] args) {
        Box<Integer> intObj = new Box<>(25);
        System.out.println("Integer value :"+intObj.getValue());

        Box<String> strObj = new Box<>("this is string");
        System.out.println("Strings: "+strObj.getValue());

        Box<Double> dblObj = new Box<>(45.899);
        System.out.println("Double : " +dblObj.getValue());

        Box<Long> longObj = new Box<>(42l);
        System.out.println("Long value:"+longObj.getValue());

    }
}
