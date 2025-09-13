import java.util.Scanner;
public class Q4_Circle {
    static double circumference(double r) {
        return 2 * Math.PI * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Circumference = " + circumference(r));
    }
}