import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean aGTB = (A > B);
        boolean bGTA = (B > A);

        System.out.println(!bGTA ? 1 : 0); // A >= B
        System.out.println(aGTB ? 1 : 0); // A > B
        System.out.println(!aGTB ? 1 : 0); // B >= A
        System.out.println(bGTA ? 1 : 0); // B > A
    }
}