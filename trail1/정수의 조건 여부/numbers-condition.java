import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();

        // 판단 및 출력
        if(a >= 113) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }

    }
}