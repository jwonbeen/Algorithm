import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 판단 및 출력
        if(a > b) {
            System.out.println(a * b);
        }
        else {
            System.out.println(b / a);
        }
    }
}