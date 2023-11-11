package JavaClasses.class7.generic;

public class WildCardGenericClassExample<T extends Number> {
    private T obj;

    public WildCardGenericClassExample(T obj){
        this.obj=obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        WildCardGenericClassExample<Integer> intObj = new WildCardGenericClassExample<>(10);
        WildCardGenericClassExample<Double> dblObj = new WildCardGenericClassExample<>(10.5);

        //this will provide error, only number accepted
//        WildCardGenericClassExample<String> strObj = new WildCardGenericClassExample<String>("string text");

        System.out.println("Get Integer number: "+intObj.getObj());
        System.out.println("Get Double number: "+dblObj.getObj());
        
    }
}

