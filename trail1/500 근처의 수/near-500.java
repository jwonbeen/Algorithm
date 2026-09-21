import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int under500Max = 0;
        int over500Min = 1000;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n > 500 && n < over500Min) {
                over500Min = n;
            }
            else if (n < 500 && n > under500Max) {
                under500Max = n;
            }
        }
        System.out.print(under500Max + " " + over500Min);
    }
}