package JavaClasses.class5;

// Base class: Shape
class Shape {
    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.displayInfo();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.displayInfo();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
