import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rowSum = 0;
        int[] colSum = new int[4];
        int totalSum = 0;

        for (int i = 0; i < 2; i++) {
            rowSum = 0;
            for (int j = 0; j < 4; j++) {
                int n = sc.nextInt();
                totalSum += n;
                rowSum += n;
                colSum[j] += n;
            }
            System.out.printf("%.1f ", (rowSum / 4.0));
        }
        System.out.println();
        for (int j = 0; j < 4; j++) {
            System.out.printf("%.1f ", (colSum[j] / 2.0));
        }
        System.out.println();
        System.out.printf("%.1f ", totalSum / 8.0);
        sc.close();
    }
}