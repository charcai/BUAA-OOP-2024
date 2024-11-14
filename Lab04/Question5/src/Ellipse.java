public class Ellipse extends Shape {
    public Ellipse(double a, double b) {
        super(a, b);
    }
    @Override
    public double calcArea() {
        return a * b * Math.PI;
    }
}
