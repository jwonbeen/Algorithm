import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 조건 1: 첫 번째 수가 최솟값인가?
        if (a <= b && a <= c) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        // 조건 2: 세 수가 모두 같은가?
        if (a == b && b == c) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}