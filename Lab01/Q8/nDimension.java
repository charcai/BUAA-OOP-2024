import java.util.Scanner;

public class nDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(++cnt + " ");
            }
            System.out.println();
        }
    }
}
