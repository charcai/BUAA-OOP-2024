import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入要创建的随机形状的个数：");
        int maxn = cin.nextInt();
        ShapeSequence shapeSequence = new ShapeSequence(maxn);
        for(int i = 0; i < maxn; ++i) {
            shapeSequence.add(ShapeFactory.randomNextShape());
        }
        System.out.println("随机生成的形状序列为：");
        System.out.println(shapeSequence.toString());

        System.out.println("面积分别为：");
        IteratorInterface iterator = shapeSequence.iterator();
        while(!iterator.isEnd()) {
            Shape shape = iterator.current();
            System.out.println(shape.type.getEnglish() + " " + shape.calcArea());
            iterator.moveNext();
        }
    }
}
