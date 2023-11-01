package JavaClasses.class5;

public class SingleInheritenceMain {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Call methods from both the parent (Vehicle) and child (Car) classes
        myCar.start();       // Inherited from Vehicle
        myCar.accelerate();  // Method from Car
        myCar.stop();        // Inherited from Vehicle
        myCar.brake();       // Method from Car
    }
}
