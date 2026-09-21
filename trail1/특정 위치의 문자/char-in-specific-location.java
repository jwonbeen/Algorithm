import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target = "LEBROS";
        char input = sc.next().charAt(0);
        sc.close();

        int idx = target.indexOf(input);

        if (idx != -1) {
            System.out.println(idx);
        } else {
            System.out.println("None");
        }
    }
}