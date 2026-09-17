import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int count = (j % 2 == 0) ? (i + 1) : (N - i);
                System.out.print(count);
            }
            System.out.println();
        }
    }
}