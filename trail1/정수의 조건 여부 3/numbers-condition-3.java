import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        // 출력
        if (a % 13 == 0 || a % 19 == 0) System.out.print("True");
        else System.out.print("False");
    }
}
