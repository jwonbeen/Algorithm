import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();

        sc.close();

        // 출력
        for (int i = 0; i < 2 * N - 1; i++) {
            // 중심에서의 거리
            int dist = Math.abs((N - 1) - i);
            // 공백 개수
            int space = (N - 1) - dist;
            // 별 개수
            int stars = 2 * dist + 1;

            // 공백 출력
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            // 별 출력
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}