import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = "";

        switch(num) {
            case 1 : str = "John";
                    break;
            case 2 : str = "Tom";
                    break;  
            case 3 : str = "Paul";
                    break;
            default : str = "Vacancy";
                    break;
        }
        System.out.println(str);
    }
}