import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0 ; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int sum = 1;
            for (int j = A; j < B + 1; j++) {
                sum *= j;
            }
            System.out.println(sum);
        }
    }
}
