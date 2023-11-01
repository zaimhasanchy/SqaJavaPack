package JavaClasses.class6.DrawMainMethod;

public class DrawMainMethod {
    public static void main(String[] args) {
        RectangleDraw obj1 = new RectangleDraw();
        obj1.draw();
        obj1.printMsg();
        System.out.println("Cube area with static method : "+Drawable.cube(6));
        System.out.println("Salary : "+Drawable.salary);
    }
}
