import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();

        // 출력
        System.out.println(N);
        if (N < 0) {
            System.out.println("minus");
        }
    }
}