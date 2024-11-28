public class Box <T extends Number> {
    T element;

    public static Number compareBoxes(Box<? extends Number> b1, Box<? extends Number> b2) {
        if(b1.element.doubleValue() - b2.element.doubleValue() < 0) {
            return b2.element;
        }
        else {
            return b1.element;
        }
    }
}
