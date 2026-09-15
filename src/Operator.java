import java.awt.*;
import java.util.Scanner;

public class Operator {
    static void main() {
        // 2.
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String szov = sc.nextLine();
        System.out.print("char1: ");
        char c1 = sc.nextLine().charAt(0);
        System.out.print("char2: ");
        char c2 = sc.nextLine().charAt(0);
        System.out.print("int1: ");
        int int1 = sc.nextInt();
        System.out.print("int2: ");
        int int2 = sc.nextInt();
        System.out.print("double1: ");
        double d1 = sc.nextDouble();
        System.out.print("double2: ");
        double d2 = sc.nextDouble();
        String egyben = szov + c1 + c2;
        double oszt = (double) int1 / int2;
        double osszead = d1 + d2;
        double kivon = int1 - d1;
        double szoroz = int2 * d2;

        IO.println("\n" + egyben + "\n" + oszt + "\n" + osszead + "\n" + kivon + "\n" + szoroz);

    }
}
