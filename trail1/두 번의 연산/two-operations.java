import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        int A = sc.nextInt();

        // 조건 연산
        if (A % 2 != 0) A += 3;
        if (A % 3 == 0) A /= 3;

        // 출력
        System.out.print(A);
    }
}