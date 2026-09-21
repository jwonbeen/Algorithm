import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = getDiagonalValue(i, j, n, m);
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    private static int getDiagonalValue(int i, int j, int n, int m) {
        int k = i + j;
        int countBefore = 0;

        for (int line = 0; line < k; line++) {
            int minI = Math.max(0, line - (m - 1));
            int maxI = Math.min(n - 1, line);
            if (minI <= maxI) {
                countBefore += (maxI - minI + 1);
            }
        }

        int startI = Math.max(0, k - (m - 1));
        int offset = i - startI;

        return countBefore + offset + 1;
    }
}