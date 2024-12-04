public class FindMinMax {
    private static final double d1 = 1, d2 = -9.9, d3 = 96.9;
    public static double max() {
        double tmp;
        tmp = d1 > d2? d1 : d2;
        return (tmp > d3? tmp : d3);
    }
    public static double min() {
        double tmp;
        tmp = d1 < d2? d1 : d2;
        return (tmp < d3? tmp : d3);
    }
    public static void main(String[] args) {
        System.out.println("max = " + max());
        System.out.println("min = " + min());
    }
}