import java.util.Scanner;
public class odd_even_numbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter  any number:");
        int a= sc.nextInt();
        System.out.println("enter any number:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            // if we want to check even numbers
            // if(i%2==0)

            // for odd number this condition is apply
            if(i%2 !=0)
            {
                // to print even numbers from b/w a to b
               // System.out.println("even numbers are:" +i);
                System.out.println("odd numbers are:" +i);
            }
        }
    }
}
