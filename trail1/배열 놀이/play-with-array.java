import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int tag = sc.nextInt();
            if (tag == 1) {
                int idx = sc.nextInt();
                System.out.println(arr[idx - 1]);
            }else if (tag == 2) {
                int target = sc.nextInt();
                int idx = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == target) {
                        idx = j + 1;
                        break;
                    }
                }
                System.out.println(idx);
            } else {
                int start = sc.nextInt() - 1;
                int end = sc.nextInt() - 1;
                for (int k = start; k < end + 1; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}