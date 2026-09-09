import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int N = sc.nextInt();
        String stuff = "";

        // 조건
        if (N >= 3000) stuff = "book";
        else if (N >= 1000) stuff = "mask";
        else if (N >= 500) stuff = "pen";
        else stuff = "no";

        //출력
        System.out.println(stuff);

    }
}