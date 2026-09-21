import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int prev = sc.nextInt();
        int minDiff = Integer.MAX_VALUE;;

        for (int i = 0; i < N - 1; i++) {
            int current = sc.nextInt();

            int diff = current - prev;

            if (diff < minDiff) {
                minDiff = diff;
            }
            prev = current;
        }
        sc.close();

        System.out.println(minDiff);
    }
}