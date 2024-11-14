class Outer {
    public int num = 10;

    class Inner {
        public int num = 20;

        public void show() {
            int num = 30;
            System.out.println(/*【1】*/ num);
            System.out.println(/*【2】*/ Inner.this.num);
            System.out.println(/*【3】*/ Outer.this.num/*【3】*/);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner(); /*【4】*/
        oi.show();
    }
}