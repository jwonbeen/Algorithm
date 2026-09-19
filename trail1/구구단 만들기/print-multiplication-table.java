import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (B % 2 != 0) B -= 1;
        if (A % 2 != 0) A += 1;

        for (int i = 1; i < 10; i++) {
            for (int j = B; j > A - 1; j-=2) {
                System.out.printf("%d * %d = %d", j, i, j * i);
                if (j != A) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}