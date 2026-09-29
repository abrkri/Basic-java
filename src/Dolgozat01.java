import java.util.ArrayList;
import java.util.Scanner;

public class Dolgozat01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // 1.

        IO.print("Név: ");
        String nev = sc.nextLine();
        IO.print("Szám 1 és 10 között: ");
        int sz1 = sc.nextInt();
        IO.print("Szám 10 és 90 között: ");
        int sz2 = sc.nextInt();

        IO.println("Hello " + nev + "!");

        // 2.

        double korsugara = Math.pow(sz1, 2) * Math.PI;
        IO.println("A kör sugara: " + korsugara); //kerekiteni kell meg
        IO.println("Kerekítve: " + Math.round(korsugara));

        // 3.

        if (sz2 < 10 || sz2 > 90) IO.println("A szám nem helyes.");
        else if (sz2 % 3 == 0 && sz2 % 5 == 0) IO.println("FizzBuzz");
        else if (sz2 % 3== 0) IO.println("Fizz");
        else if (sz2 % 5 == 0) IO.println("Buzz");
        else IO.println(sz2);

        // 4.
    boolean prim = true;
        ArrayList<Integer> oszt = new ArrayList<>();
        if (sz1 >= 10 || sz1 <= 1) IO.println("A szám téves.");
        else {
            for (int i = 2; i < sz1; i++) {
                if (sz1 % i == 0) {
                    prim = false;
                    oszt.add(i);
                }
            }
            if (prim) IO.println("A szám prím");
            else {
                IO.println("A szám nem prím, mert osztható a(z) " + oszt + " szám(okk)al");
            }
        }
    }
}
