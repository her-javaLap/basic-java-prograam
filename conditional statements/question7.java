import java.util.Scanner;
public class question7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no:");
        int a=sc.nextInt();
        System.out.println("enter second no:");
        int b=sc.nextInt();
        System.out.println("chose operation(1,2,3,4):");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '1':
                System.out.println("result:" +(a+b));
                break;
            case '2':
                System.out.println("result:" +(a-b));
                break;
            case '3':
                System.out.println("result:" +(a*b));
                break;
            case '4':
                System.out.println("result:" +(a/b));
                break;
            default:
                System.out.println("invalid operator");
        }


    }
}
