public class Metodusok2 {

    public static double negyzetTerulet(double a, double b) {
        if (a == 0 || b == 0) return 0;
        else if (a < 0 || b < 0) return -1;
        else return a * b;

    }

    public static int harmadikSzog(int a, int b) {
        if (a == 0 || b == 0) return -1;
        else if (a < 0 || b < 0) return -1;
        else if (a + b >= 180) return -1;
        else return 180 - (a + b);
    }

    public static boolean vanNagybetu(String s) {
        if (s.length() == 0) return false;
        for(int i = 0; i < s.length(); i ++) {
            if (Character.isUpperCase(s.charAt(i))) return true;
        }
        return false;
    }

    public static String fejVagyIras(int num) {
        if (num > 0) return "fej";
        else if (num < 0) return "iras";
        else return "elere esett";
    }

    static void main() {
        System.out.println(negyzetTerulet(2, 3));
        System.out.println(negyzetTerulet(0, 3));
        System.out.println(negyzetTerulet(2, 0));
        System.out.println(negyzetTerulet(-2, 3));
        System.out.println(negyzetTerulet(2, -3));
        System.out.println(negyzetTerulet(-2, -3));
        System.out.println(harmadikSzog(20, 30));
        System.out.println(harmadikSzog(30, 40));
        System.out.println(harmadikSzog(90, 90));
        System.out.println(harmadikSzog(80, 120));
        System.out.println(harmadikSzog(0, 45));
        System.out.println(harmadikSzog(45, 0));
        System.out.println(harmadikSzog(-45, 45));
        System.out.println(harmadikSzog(45, -45));
        System.out.println(vanNagybetu("Alma"));
        System.out.println(vanNagybetu("alma"));
        System.out.println(vanNagybetu("alMa"));
        System.out.println(vanNagybetu("123"));
        System.out.println(vanNagybetu(""));
        System.out.println(fejVagyIras(3));
        System.out.println(fejVagyIras(10));
        System.out.println(fejVagyIras(-3));
        System.out.println(fejVagyIras(-10));
        System.out.println(fejVagyIras(0));
    }
}
