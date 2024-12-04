import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.print("请输入两个长度a和b：");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        Rectangle rectangle = new Rectangle(a, b);
        Rhombus rhombus = new Rhombus(a, b);
        Ellipse ellipse = new Ellipse(a, b);

        System.out.print("以 " + a + " , " + b + " 作为两边长的矩形的面积为: ");
        System.out.println(rectangle.calcArea());

        System.out.print("以 " + a + " , " + b + " 作为两对角线长的菱形形的面积为: ");
        System.out.println(rhombus.calcArea());

        System.out.print("以 " + a + " , " + b + " 作为两半轴长的椭圆形的面积为: ");
        System.out.println(ellipse.calcArea());
    }
}
