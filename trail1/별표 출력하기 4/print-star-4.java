import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();

        sc.close();

        // 출력
        for (int i = 0; i < 2 * N - 1; i++) {
            int stars = Math.abs((N - 1) - i) + 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}