public class Test {
    public static void main(String[] args) {
        Parent child1 = new Child1();
        Parent child2 = new Child2();

        Pair<Parent, Parent> pair = new Pair<>(child1, child2);
        pair.swap();

        Pair<String, Integer> another = new Pair<>("str", 114514);
        another.swap();
    }
}
