import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int subMax = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++){
            int val = sc.nextInt();
            if (val > max) {
                subMax = max;
                max = val;
            }
            else if (val > subMax) {
                subMax = val;
            }
        }
        System.out.print(max + " " + subMax);
    }
}