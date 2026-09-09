import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int r = sc.nextInt();
        int c = sc.nextInt();

        // 값 변환
        r += 8;
        c *= 3;

        // 출력
        // System.out.println(r + "\n" + c + "\n" + (r * c));
        System.out.println(r);
        System.out.println(c);
        System.out.println(r * c);
    }
}