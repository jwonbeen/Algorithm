import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        double N = sc.nextDouble();

        // 값 변경 및 출력
        System.out.printf("%.1f", N * 30.48);
    }
}