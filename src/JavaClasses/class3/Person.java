package JavaClasses.class3;

public class Person {
    String name;
    String mobileNo;
    int age;
    String address;

    public void printName(){
        System.out.println("Name is :" + name);
    }

    public void printAddress(String address) {
        System.out.println("Address is: " + address);
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public int getAge() {
        return age;
    }
}
