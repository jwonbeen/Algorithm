import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int sum = 0, avg = 0;
        int N = 3;

        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
        }

        avg = sum / N;

        // 출력
        System.out.println(sum);
        System.out.println(avg);

    }
}