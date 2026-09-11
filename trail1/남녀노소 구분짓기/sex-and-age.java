import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int sex = sc.nextInt();
        boolean isAdult = (sc.nextInt() >= 19);
        // 출력
        if (sex == 0 && isAdult) System.out.print("MAN");
        else if (sex == 0) System.out.print("BOY");
        else if (isAdult) System.out.print("WOMAN");
        else System.out.print("GIRL");
    }
}