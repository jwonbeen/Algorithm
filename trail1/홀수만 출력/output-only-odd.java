import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 출력
        for (int i = A; i < B + 1; i += 2) {
            System.out.print(i + " ");
        }
    }
}