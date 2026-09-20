import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOf2s = 0;
        int sumOf3s = 0;

        for (int i = 1; i < 11; i++) {
            int dummy = sc.nextInt();
            if (i % 2 == 0) {
                sumOf2s += dummy;
            }
            if (i % 3 == 0) {
                sumOf3s += dummy;
            }
        }

        System.out.print(sumOf2s + " ");
        System.out.printf("%.1f", (double)sumOf3s / 3);
    }
}