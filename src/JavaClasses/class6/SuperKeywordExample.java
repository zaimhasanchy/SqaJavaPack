package JavaClasses.class6;

class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);  // Calling the constructor of the superclass
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void display() {
        super.display();  // Calling the display() method of the superclass
        System.out.println("numberOfDoors: "+numberOfDoors);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 4);
        car.display();

    }
}
