import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int aM = sc.nextInt();
        int aE = sc.nextInt();
        int bM = sc.nextInt();
        int bE = sc.nextInt();
        
        // 조건 및 출력
        if (aM > bM && aE > bE) System.out.println(1);
        else System.out.println(0);


    }
}