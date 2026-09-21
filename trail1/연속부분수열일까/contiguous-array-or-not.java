import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int[] A = new int[N1];
        for (int i = 0; i < N1; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[N2];
        for (int i = 0; i < N2; i++) {
            B[i] = sc.nextInt();
        }
        sc.close();

        boolean isSubsequence = false;

        for (int i = 0; i <= N1 - N2; i++) {
            boolean matched = true;

            for (int j = 0; j < N2; j++) {
                if (A[i + j] != B[j]) {
                    matched = false;
                    break;
                }
            }

            if (matched) {
                isSubsequence = true;
                break;
            }
        }

        System.out.println(isSubsequence ? "Yes" : "No");
    }
}