import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();

        // 출력
        if (a < 10 || a > 20) System.out.print("yes");
        else System.out.print("no");
    }
}