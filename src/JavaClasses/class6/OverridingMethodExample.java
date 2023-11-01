package JavaClasses.class6;

class Shape {
    double calculateArea() {

        return 0.0; // Default implementation for the base class
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    @Override
    double calculateArea() {

        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class OverridingMethodExample {
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        System.out.println("Circle Area: "+ circle.calculateArea());

        Rectangle rectangle = new Rectangle(8,9);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
