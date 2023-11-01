package JavaClasses.class3;

public class MainClass {
    public static void main(String[] args) {
        ClassFormat test = new ClassFormat();
        test.printsomething();

        Person person = new Person();
        person.name = "Hasan";
        person.age = 21;
        person.mobileNo = "01911000000";

        person.printName();
        person.printAddress("Bcok Z, Dhaka");
        System.out.println("age is : " + person.getAge());
        System.out.println("Mobile no is: " + person.getMobileNo());

        Employee employee1 = new Employee();
        employee1.salary=20000;
        employee1.designation="IT Admin";
        System.out.println("Employee1 bonus is: "+employee1.getSalary());

        Employee employee2=new Employee(123456, "hasan");
        System.out.println("Employee2 bonus is: "+ employee2.getSalary());


    }
}
