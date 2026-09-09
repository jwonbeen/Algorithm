import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("[-\\s]");
        // 변수 선언 및 입력
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        // 출력
        System.out.printf("%s-%s-%s", a, c, b);
    }
}