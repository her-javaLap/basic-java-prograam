import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter  any number:");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            // simple formate
           // System.out.println(a * i);
            System.out.println(a+ "x" +i + "=" +(a*i));
        }
    }
}
