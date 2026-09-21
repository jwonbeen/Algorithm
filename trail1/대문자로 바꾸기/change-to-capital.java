import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                char n = sc.next().charAt(0);
                char upper = (char) (n - 32);
                System.out.print(upper + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}