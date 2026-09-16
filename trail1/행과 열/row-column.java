import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = 0 ; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.printf("%d ", (i + 1) * (j + 1));
            }
            System.out.println();
        }

    }
}