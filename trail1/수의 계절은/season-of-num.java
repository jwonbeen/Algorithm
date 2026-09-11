import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int M = sc.nextInt();

        // 출력
        if (2 >= M || M >= 12) System.out.print("Winter");
        else if (M <= 5) System.out.print("Spring");
        else if (M <= 8) System.out.print("Summer");
        else System.out.print("Fall");

    }
}