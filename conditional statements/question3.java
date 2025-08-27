import java.util.Scanner;
public class question3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+ "greater");
        }
        else if(a<b){
            System.out.println(b+ "is greater");
        }
        else{
            System.out.println("borth numbers are equal.");
        }
    }
}
