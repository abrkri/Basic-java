import java.util.Scanner;

public class Szamol2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szam: ");
        int sz = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % sz != 0) continue;
            if (i == sz * 10) {
                IO.println(sz);
                break;
            }
            IO.print(i + "; ");
        }
    }
}
