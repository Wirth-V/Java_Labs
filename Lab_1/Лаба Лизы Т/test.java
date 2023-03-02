import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Re(1): ");
        int re1 = scanner.nextInt();
        System.out.print("Im(1): ");
        int im1 = scanner.nextInt();
        System.out.print("Re(2): ");
        int re2 = scanner.nextInt();
        System.out.print("Im(2): ");
        int im2 = scanner.nextInt();
        Complex c1 = new Complex(re1, im1);
        Complex c2 = new Complex(re2, im2);

        System.out.println("Module c(1): " + c1.Mod());
        System.out.println("Module c(2): " + c2.Mod());

        //double re = 0, im = 0;
        Complex sum = new Complex(0, 0);
        Complex c3 = sum.Sum (re1, im1, re2, im2);
        System.out.println("Sum c(1) + c(2): " + c3.Re + " " + c3.Im + "i" );

        c1.Add(re1, im1, re2, im2);
        c1.Sub(re1, im1, re2, im2);

        System.out.println("Argument c(1): " + c1.Arg());
        System.out.println("Argument c(2): " + c2.Arg());
    }
}
