import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        String b = "";

        // 조건
        if (a == 5) b = "A";
        else if (a % 2 == 0) b = "B";

        // 출력
        System.out.println(b);

    }
}