import java.util.Scanner;

public class Soutln {
    static void main() {

        // 1.
        String msg = "I'm happy today.";
        int a = 150;
        int o = 0226;
        int h = 0x96;
        double d = 10;
        System.out.println(msg);
        System.out.println(a);
        System.out.println(o);
        System.out.println(h);
        System.out.println(d);

        // 2.
        Scanner sc = new Scanner(System.in);
        System.out.print("Kedvenc zene: ");
        String zene = sc.next();
        System.out.print("Kedvenc étel: ");
        String etel = sc.next();
        System.out.print("Kedvenc hobbi: ");
        String hobbi = sc.next();
        System.out.print("Kedvenc film: ");
        String film = sc.next();
        System.out.print("Kedvenc uticél: ");
        String uticel = sc.next();

        //3.
        System.out.println("A kedvenc zeneszámod: " + zene);
        System.out.println("A kedvenc ételed: " + etel);
        System.out.println("A kedvenc hobbid: " + hobbi);
        System.out.println("A kedvenc filmed: " + film);
        System.out.println("A kedvenc uticélod: " + uticel);
    }
}
