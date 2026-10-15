import java.util.Scanner;

public class Rekurzio {

    // 1.
    static int Faktorialis(int szam) {
        if (szam > 0) return szam * Faktorialis(szam - 1);
        else return  1;
    }

    // 2.

    static int Hatvany(int alap, int hatvany) {
        if (hatvany > 0) return alap * Hatvany(alap, hatvany - 1);
        else return 1;
    }

    static int Fibonacci(int n) {
        if (n < 2) return 0;
        else if (n <= 3) return 1;
        return (Fibonacci(n - 1) + Fibonacci(n - 2));

    }



    static void main() {
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        IO.println(Faktorialis(szam));
        int alap = sc.nextInt();
        int hatvany = sc.nextInt();
        IO.println(Hatvany(alap, hatvany));
        int n = sc.nextInt();
        IO.println(Fibonacci(n));
    }
}
