import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int right = N - 1;
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        while (right >= 0) {
            int maxVal = Integer.MIN_VALUE;
            int maxIdx = -1;

            for (int i = 0; i <= right; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    maxIdx = i;
                }
            }

            System.out.print((maxIdx + 1) + " ");

            if (maxIdx == 0) {
                break;
            }

            right = maxIdx - 1;
        }
    }
}