import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("[.\\s]");
        // 변수 선언 및 입력
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        // 출력
        System.out.printf("%d-%d-%d", m, d, y);

    }
}