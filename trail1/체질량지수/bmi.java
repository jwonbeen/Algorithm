import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int h = sc.nextInt();
        int w = sc.nextInt();

        // BMI 계산
        int b = (10000 * w) / (h * h);

        // 출력
        System.out.println(b);
        if (b >= 25) {
            System.out.println("Obesity");
        }
    }
}