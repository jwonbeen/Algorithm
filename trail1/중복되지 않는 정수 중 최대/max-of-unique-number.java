import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] count = new int[1001];
        int res = -1;

        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            count[val]++;
        }

        for (int i = 1000; i >= 1; i--) {
            if (count[i] == 1) {
                res = i;
                break;
            }
        }
        System.out.print(res);
    }
}