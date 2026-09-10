import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 조건 판단 및 출력
        if(A < B) {
            System.out.print(1 + " ");
        }else {
            System.out.print(0 + " ");
        }
        if (A == B) {
            System.out.print(1);
        }else {
            System.out.print(0);
        }
        

    }
}