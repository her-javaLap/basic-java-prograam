import java.util.Scanner;
public class Factorial {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        // with userdefine

        System.out.println("enter any number:");
        int a= sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact *=i;
        }

        //without userdefine

       // int n = 5;
       // int fact = 1;
       // for (int i = 1; i <= n; i++) {
        //    fact *= i;
       // }
        System.out.println("Factorial = " + fact);

    }
    }
