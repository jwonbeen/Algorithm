import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = 1;
        int a = 0;

        System.out.print(M + " " + N + " ");

        while(a < 100) {
            a = M + N;
            System.out.print(a + " ");

            M = N;
            N = a;
        }
    }
}