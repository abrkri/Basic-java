import java.util.Scanner;

public class Szamol3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szam1: ");
        int sz1 = sc.nextInt();
        System.out.print("Szam2: ");
        int sz2 = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % sz1 == 0 && i % sz2 == 0) {
                IO.println("FizzBuzz");
                break;
            }
            else if (i % sz1 == 0) IO.println("Fizz");
            else if (i % sz2 == 0) IO.println("Buzz");
            else IO.println(i);
        }
    }
}
