package JavaClasses.class3;

public class Employee {

    private int id;
    private String name;

    String designation;
    double salary;

    public Employee(){

    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("ID: "+id);
        System.out.println("name: "+name);
    }

    public double getSalary(){
        return 0.25 * salary;
    }
}
