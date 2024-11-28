public class Test {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>();
        b1.element = 5;
        Box<Double> b2 = new Box<Double>();
        b2.element = 3.0;
        System.out.println(Box.compareBoxes(b1, b2));
    }
}
