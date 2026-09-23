import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        int cnt = 0;
        char keyword = sc.next().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            if (keyword == arr[i].charAt(2) || keyword == arr[i].charAt(3)) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(cnt);
    }
}