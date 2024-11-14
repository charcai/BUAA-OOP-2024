public class ShapeFactory {
    public static Shape makeShape(ShapeType type, double a, double b) {
        return switch (type) {
            case ELLIPSE -> new Ellipse(a, b);
            case RHOMBUS -> new Rhombus(a, b);
            case RECTANGLE -> new Rectangle(a, b);
        };
    }
    public static Shape randomNextShape() {
        return makeShape(ShapeType.values()[(int) (Math.random() * ShapeType.values().length)], Math.random() * 10, Math.random() * 10);
    }
}
