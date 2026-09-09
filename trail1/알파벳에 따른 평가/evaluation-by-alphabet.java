import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        char Cap = sc.next().charAt(0);
        String str = "";

        // 조건
        if(Cap == 'S') str = "Superior";
        else if(Cap == 'A') str = "Excellent";
        else if(Cap == 'B') str = "Good";
        else if(Cap == 'C') str = "Usually";
        else if(Cap == 'D') str = "Effort";
        else str = "Failure";

        // 출력
        System.out.println(str);
    }
}