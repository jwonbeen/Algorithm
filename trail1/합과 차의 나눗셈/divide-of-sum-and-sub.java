import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        double c = (double)(a + b) / (a - b);

        // 출력
        System.out.printf("%.2f", c);
    }
}