import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int M = sc.nextInt();

        // 출력
        if (3 <= M && M <=5) System.out.print("Spring");
        else if (6 <= M && M <= 8) System.out.print("Summer");
        else if (9 <= M && M <= 11) System.out.print("Fall");
        else System.out.print("Winter");

    }
}