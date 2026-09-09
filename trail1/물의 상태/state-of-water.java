import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int temp = sc.nextInt();

        // 조건 판단 및 출력
        if(temp >= 100) System.out.println("vapor");
        else if(temp < 0)  System.out.println("ice");
        else  System.out.println("water");
    }
}