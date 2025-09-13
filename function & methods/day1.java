import java.sql.SQLOutput;
import java.util.Scanner;
public class day1 {
    public static void printmyname( String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printmyname(name);
    }
}
