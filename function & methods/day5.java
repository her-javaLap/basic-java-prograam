import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double avg=(a+b+c)/3.0;
        System.out.println("Average="+avg);
    }
}