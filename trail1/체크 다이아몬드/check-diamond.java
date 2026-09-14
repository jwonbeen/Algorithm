import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();

        sc.close();

        for (int i = 0; i < 2 * N - 1; i++) {
            // 공백의 개수 계산
            int space = Math.abs((N - 1) - i); 
            for (int j = 0; j < N; j++) {
                if(j < space) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}