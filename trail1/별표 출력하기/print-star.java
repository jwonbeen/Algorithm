import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();
        
        sc.close();

        // 출력
        // 총 2*N - 1 개의 행을 하나의 루프로 처리
        for (int i = 0; i < 2 * N - 1; i++) {
            // 중심(N-1)과의 거리를 이용해 별의 개수를 계산
            int stars = N - Math.abs((N - 1) - i);
            
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}