import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        // 상단부 (N줄): 공백은 줄어들고 별은 늘어남
        for (int i = 0; i < N; i++) {
            int space = N - 1 - i;
            int stars = N - space;

            for (int j = 0; j < space; j++) System.out.print("  ");
            for (int j = 0; j < stars; j++) System.out.print("@ ");
            System.out.println();
        }

        // 2. 하단부 (N-1줄): 별만 줄어듦 (공백 없음)
        for (int i = 0; i < N - 1; i++) {
            int stars = N - 1 - i;
            for (int j = 0; j < stars; j++) System.out.print("@ ");
            System.out.println();
        }
    }
}  