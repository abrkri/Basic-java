import java.util.Scanner;

public class ParosParatlanWhile {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int sz = -1;
        do {
            System.out.print("Szamot: ");
            sz = sc.nextInt();
        }
        while (sz < 0);

        IO.println((sz % 2 == 0) ? "paros" : "paratlan");


    }
}
