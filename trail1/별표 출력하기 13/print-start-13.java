import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        for (int i = 0; i < 2 * N; i++) {
            int group = i / 2;
            if (i % 2 != 0) {
                for (int j = 0; j < group + 1; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 0; j < N - group; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}