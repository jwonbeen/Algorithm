import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a < min) {
                min = a;
                cnt = 1;
            }
            else if (a == min) {
                cnt++;
            }
        }

        System.out.print(min + " " + cnt);
    }
}