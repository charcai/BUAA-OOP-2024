public class Main {
    byte b;
    short s;
    int i;
    long l;
    boolean bool;
    char c;
    float f;
    double d;
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("byte: " + m.b);
        System.out.println("short: " + m.s);
        System.out.println("int: " + m.i);
        System.out.println("long: " + m.l);
        System.out.println("bool: " + m.bool);
        System.out.println("char: " + (int)m.c);
        System.out.println("float: " + m.f);
        System.out.println("double: " + m.d);
    }
}
