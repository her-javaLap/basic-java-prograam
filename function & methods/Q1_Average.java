import java.util.Scanner;
public class Q1_Average {
   static double average(int a,int b,int c)
   {
       return(a+b+c)/3.0;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average="+average(a,b,c));

    }
}
