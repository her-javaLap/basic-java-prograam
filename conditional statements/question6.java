import java.util.Scanner;
public class question6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks(1-100):");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("grade a");
        }
        else if(marks>=80){
            System.out.println("grade b");
        }
        else if(marks>=70)
        {
            System.out.println("grade c");
        }
        else if(marks>=60)
        {
            System.out.println("grade d");
        }
        else if(marks>=50){
            System.out.println("grade f");
        }
        else{
            System.out.println("Invalid input marks b/w 1 and 100");
        }
    }

}
