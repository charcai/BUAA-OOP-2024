public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for(int i = 0; i < 5; ++i) {
            shapes[i] = ShapeFactory.randomNextShape();
        }
        for(Shape i : shapes) {
            System.out.println(i.calcArea());
        }
    }
}
