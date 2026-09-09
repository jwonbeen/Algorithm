import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();
        char score;

        // 조건
        if (N >= 90) score = 'A';
        else if (N >= 80) score = 'B';
        else if (N >= 70) score = 'C';
        else if (N >= 60) score = 'D';
        else score = 'F';

        // 출력
        System.out.println(score);
    }
}