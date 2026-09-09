import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 설정 및 입력
        sc.useDelimiter("[-\\s]");

        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        // 출력
        System.out.printf("%d.%d.%d", y, m, d);
    }
}