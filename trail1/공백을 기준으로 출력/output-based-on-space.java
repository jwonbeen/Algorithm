import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine().replace(" ", "");
        String str2 = sc.nextLine().replace(" ", "");

        System.out.print(str1 + str2);
    }
}