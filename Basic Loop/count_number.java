import java.util.Scanner;
public class count_number {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter  any number:");
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        System.out.println("Digit Count = " + count);
    }
    }
