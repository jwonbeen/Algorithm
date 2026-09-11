import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = Math.max(A, Math.max(B, C));
        int min = Math.min(A, Math.min(B, C));

        // 출력
        System.out.print(A + B + C - max - min);
    }
}