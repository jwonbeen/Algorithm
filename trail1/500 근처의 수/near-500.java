import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int under500 = 0;
        int up500 = 1000;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n > 500 && n < up500) {
                up500 = n;
            }
            else if (n < 500 && n > under500) {
                under500 = n;
            }
        }
        System.out.print(under500 + " " + up500);
    }
}