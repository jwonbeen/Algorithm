import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 조건 판단을 위한 변수
        boolean isEqual = (A == B);
        boolean aGreaterThanB = (A > B);
        boolean bGreaterThanA = (B > A);

        // 출력
        System.out.println(!bGreaterThanA ? 1 : 0); // A >= B
        System.out.println(aGreaterThanB ? 1 : 0); // A > B
        System.out.println(!aGreaterThanB ? 1 : 0); // B >= A
        System.out.println(bGreaterThanA ? 1 : 0); // B > A
        System.out.println(isEqual ? 1 : 0); // A == B
        System.out.println(!isEqual ? 1 : 0); // A != B

    }
}