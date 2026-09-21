import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            boolean isY = sc.next().charAt(0) == 'Y';
            boolean isFever = sc.nextInt() >= 37;

            // (>= 37, Y),(>=37, N),(<37, Y),(<37, N) = 0, 1, 2, 3
            int index = (isY ? 0 : 1) + (isFever ? 0 : 2);
            arr[index]++;
        }
        
        for (int j : arr) {
            System.out.print(j + " ");
        }
        if (arr[0] >= 2) System.out.print("E");
    }
}