abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    void area() {
        int r = 5;
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
}
class Rectangle extends Shape {
    void area() {
        int l = 10, b = 5;
        System.out.println("Area of rectangle: " + (l * b));
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.area();
        s = new Rectangle();
        s.area();
    }
}
