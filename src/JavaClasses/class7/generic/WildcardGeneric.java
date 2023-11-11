package JavaClasses.class7.generic;

import java.util.List;

public class WildcardGeneric {
    public static double summethod(List<? extends Number> list){
        double total =0.0;
        for (Number number:list){
            total+= number.doubleValue();
        }

        return total;
    }

    public static void main(String[] args) {
        List<Integer> intObj = List.of(1,5,8,10);
        List<Double> dblObj = List.of(1.5,2.6,10.5,11.3);

        System.out.println("Sum of Integers: "+summethod(intObj));
        System.out.println("Sum of Doubles: "+summethod(dblObj));
    }
}
