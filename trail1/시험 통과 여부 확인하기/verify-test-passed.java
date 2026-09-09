import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();

        // 통과여부 판단 및 출력
        if(N >= 80) {
            System.out.println("pass");
        }
        else {
            System.out.printf("%d more score", (80 - N));
        }
    }
}