import java.util.Scanner;

public class Rekurzio {

    // 1.
    static int faktorialis(int szam) {
        if (szam > 0) return szam * faktorialis(szam - 1);
        else return  1;
    }

    // 2.

    static int hatvany(int alap, int hatvany) {
        if (hatvany > 0) return alap * hatvany(alap, hatvany - 1);
        else return 1;
    }

    static int fibonacci(int n) {
        if (n < 2) return 0;
        else if (n <= 3) return 1;
        return (faktorialis(n - 1) + faktorialis(n - 2));

    }

    public static void hanoi(int n, char forras, char koztes, char cel) {
        if (n == 1) {
            System.out.println(forras + " -> " + cel);
            return;
        }

        hanoi(n - 1, forras, cel, koztes);
        System.out.println(forras + " -> " + cel);
        hanoi(n - 1, koztes, forras, cel);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        IO.println(faktorialis(szam));
        int alap = sc.nextInt();
        int hatvany = sc.nextInt();
        IO.println(hatvany(alap, hatvany));
        int n = sc.nextInt();
        IO.println(faktorialis(n));

        int nn = sc.nextInt();
        hanoi(nn, '1', '2', '3');
    }
}
