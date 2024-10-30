public class Variable {
    public static String strscat(String... args) {
        String ss = "";
        for(String x : args) {
            ss = ss + x;
        }
        return ss;
    }
    public static void main(String[] args) {
        System.out.println(strscat("a", "b", "c", "d", "e"));
        System.out.println(strscat("str"));
    }
}
