import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 설정 및 입력
        sc.useDelimiter("[-\\s]");
        String a = sc.next();
        String b = sc.next();
        // 출력
        System.out.print(a + b);
    }
}