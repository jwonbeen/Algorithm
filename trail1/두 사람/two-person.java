import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int aAge = sc.nextInt();
        char aSex = sc.next().charAt(0);
        int bAge = sc.nextInt();
        char bSex = sc.next().charAt(0);

        // 출력
        if ((aAge >= 19 && aSex == 'M') || (bAge >= 19 && bSex == 'M')){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}