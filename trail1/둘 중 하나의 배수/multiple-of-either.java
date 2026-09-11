import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int A = sc.nextInt();

        // 출력
        if (A % 3 == 0 || A % 5 == 0) System.out.print(1);
        else System.out.print(0);

    }
}