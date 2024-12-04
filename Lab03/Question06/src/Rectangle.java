public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(a, b);
    }
    @Override
    public double calcArea() {
        return a * b;
    }
}
