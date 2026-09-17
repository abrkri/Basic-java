import java.util.Scanner;

public class String_muveletek {
    static  void main() {
        Scanner sc = new Scanner(System.in);
        // 2.
        System.out.print("Vezetéknév: ");
        String vnev = sc.nextLine();
        System.out.print("Keresztnáv: ");
        String knev = sc.nextLine();
        System.out.print("Születési hely: ");
        String szhely = sc.nextLine();
        System.out.print("Kor: ");
        int kor = sc.nextInt();

        // 3.
        String fullName = vnev + " " + knev;

        // 4.
        IO.println(fullName.toUpperCase());

        // 5.
        IO.println(fullName.indexOf(knev));

        // 6.
        IO.println((fullName + " " + szhely).toLowerCase());

        // 7.
        IO.println(kor + " " + szhely + " " + fullName);

        // 8.
        IO.println(knev.toUpperCase().startsWith("A") ? "Igen" : "Nem");

        // 9.
        IO.println(vnev.toLowerCase().endsWith("t")? "Igen" : "Nem");

        // 10.
        IO.println(fullName.length());

        // 11.
        IO.println(fullName.replace('i', 'y'));
    }
}
