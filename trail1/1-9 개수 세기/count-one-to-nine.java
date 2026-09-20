import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < N; i++) {
            arr[sc.nextInt()]++;
        }
        for (int j = 1; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}