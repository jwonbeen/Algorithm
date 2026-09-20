import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        int res = 0;

        while(cnt < 2) {
            res += N;
            System.out.print(res + " ");
            if (res % 5 == 0) {
                cnt++;
            }
        }
    }
}