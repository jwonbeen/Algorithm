import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int[] counts = new int[B];

        while (A > 1) {
            int remainder = A % B;
            counts[remainder]++;
            A /= B;
        }

        int totalSum = 0;
        for (int cnt : counts) {
            totalSum += cnt * cnt;
        }

        System.out.println(totalSum);
    }
}