import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < 2 * N - 1; i++) {
            int stars = N - Math.abs((N-1) - i);
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}