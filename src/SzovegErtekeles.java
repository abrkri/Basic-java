import java.util.Scanner;

public class SzovegErtekeles {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Egesz szam: ");
        int sz = sc.nextInt();

        switch (sz) {
            case 1: IO.println("elégtelen");break;
            case 2: IO.println("elégseges");break;
            case 3: IO.println("közepes");break;
            case 4: IO.println("jó");break;
            case 5: IO.println("jeles");break;
            default: IO.println("Nincs ilyen jegy");break;
        }
    }
}
