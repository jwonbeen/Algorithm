import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        char c = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // 출력
        System.out.printf("%c\n%.2f\n%.2f", c, a, b);
    }
}
