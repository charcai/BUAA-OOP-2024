public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(a, b);
        type = ShapeType.RECTANGLE;
    }
    @Override
    public double calcArea() {
        return a * b;
    }
}
