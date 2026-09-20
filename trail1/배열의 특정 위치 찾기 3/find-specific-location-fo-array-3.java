import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        while(sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num == 0) break;

            a = b;
            b = c;
            c = num;
        }

        System.out.print(a + b + c);
    }
}