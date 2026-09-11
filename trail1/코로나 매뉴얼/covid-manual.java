import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            char sym = sc.next().charAt(0);
            int tem = sc.nextInt();
            if (sym == 'Y' && tem >= 37) {
                cnt++;
            }
        }
        // 출력
        System.out.print(cnt >= 2 ? "E" : "N");
    }
}