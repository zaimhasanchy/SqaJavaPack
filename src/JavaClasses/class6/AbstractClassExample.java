package JavaClasses.class6;

abstract class ShapeClass{
    abstract double calculateArea();
}

class CircleClass extends ShapeClass{
    private double radius;

    public CircleClass(double radius){

        this.radius=radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius *radius;
    }
}

class RectangleClass extends ShapeClass {
    private double length;
    private double width;

    public RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class TriangleClass extends ShapeClass {
    private double base;
    private double height;

    public TriangleClass(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        ShapeClass circle = new CircleClass(8.0);
        ShapeClass rectangle = new RectangleClass(4.0, 6.0);
        ShapeClass triangle = new TriangleClass(3.0, 4.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());

    }
}
