import java.util.Scanner;
public class day3 {
    public static int calculateProduct(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("product pf 2 no is "+calculateProduct(a,b));
    }
}
