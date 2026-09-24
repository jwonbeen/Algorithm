import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[20];

        int cnt = 0;

        while(sc.hasNext()) {
            arr[cnt++] = sc.next();
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[cnt - 1 - i]);
        }
    }
}