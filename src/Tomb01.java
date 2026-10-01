import java.util.Arrays;
import java.util.Scanner;

public class Tomb01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Tömb mérete: ");
        int size = sc.nextInt();

        int [] t = new int[size];
        int db = 0;
        while (db != size) {
            IO.print("Adat: ");
            t[db] = sc.nextInt();
            db++;
        }
        for (int i = 0; i < t.length; i++) IO.print(t[i] + "; ");
        }
    }
