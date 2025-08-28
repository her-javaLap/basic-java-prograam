import java.util.Scanner;

public class reverse {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter  any number:");
        int a = sc.nextInt();
        int rev = 0;
        while (a != 0) {
            rev = rev * 10 + a % 10;
            a /= 10;
        }
        System.out.println("Reversed Number = " + rev);

    }
}
