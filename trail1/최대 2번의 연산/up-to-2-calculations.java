import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();

        // 조건
        if (a % 2 == 0) a /= 2;
        if (a % 2 != 0) a = (a + 1) / 2;

        // 출력
        System.out.println(a);
    }
}