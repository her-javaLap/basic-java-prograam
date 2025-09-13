import java.util.Scanner;
public class Q2_SummOdd {
    static int sumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
            return sum;
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n:");
            int n=sc.nextInt();
            System.out.println("sum of odd numbers:"+sumOdd(n));

        }

    }

