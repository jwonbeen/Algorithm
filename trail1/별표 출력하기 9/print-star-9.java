import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();

        sc.close();

        // 별 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N + i; j++) {
                if (j < ((N - 1) - i)) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}