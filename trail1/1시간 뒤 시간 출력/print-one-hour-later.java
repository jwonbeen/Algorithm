import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력양식 설정
        sc.useDelimiter("[:\\s]");
        // 변수 선언 및 입력
        int h = sc.nextInt();
        int m = sc.nextInt();
        // 출력
        System.out.print((h + 1) + ":" + m);
    }
}