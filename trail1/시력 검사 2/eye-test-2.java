import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        double a = sc.nextDouble();

        // 조건 판단 및 출력
        if(a >= 1.0) System.out.println("High");
        else if(a >= 0.5) System.out.println("Middle");
        else System.out.println("Low");
    }
}