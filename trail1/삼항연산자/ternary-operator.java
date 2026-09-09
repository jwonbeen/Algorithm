import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean res = sc.nextInt() == 100 ? true : false;

        if(res) {
            System.out.print("pass");
        }
        else {
            System.out.print("failure");
        }

    }
}