public class MetodusokDolgozat {
    static int masodfokuMegoldasSzam(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) return -1;
        else if (d > 0) return 2;
        else if (d == 0) return 1;
        else return 0;
    }
    static boolean vanKisbetu(String text) {
        for (var i = 0; i < text.length(); i++) {
            if (!text.contains(text.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    static String getMeret(double num) {
        if (num < 150) return "XS";
        else if (num >= 150 && num < 160) return "S";
        else if (num >= 160 && num < 170) return "M";
        else if (num >= 170 && num < 180) return "L";
        else if (num >= 180 && num < 190) return "XL";
        else return "XXL";
    }

    static String rubikKockaSzin(int colour) {
        return switch (colour) {
            case 1 -> "yellow";
            case 2 -> "red";
            case 3 -> "orange";
            case 4 -> "white";
            case 5 -> "blue";
            case 6 -> "green";
            default -> "invalid parameter";
        };
    }

    static void main(String[] args) {
        System.out.println(masodfokuMegoldasSzam(0, 6, 5)); // -1
        System.out.println(masodfokuMegoldasSzam(0, 1, 1)); // -1
        System.out.println(masodfokuMegoldasSzam(1, 3, 4)); // 0
        System.out.println(masodfokuMegoldasSzam(2, 4, 3)); // 0
        System.out.println(masodfokuMegoldasSzam(2, -4, 2)); // 1
        System.out.println(masodfokuMegoldasSzam(1, -2, 1)); // 1
        System.out.println(masodfokuMegoldasSzam(1, 0, -4)); // 2
        System.out.println(masodfokuMegoldasSzam(2, 2, -2)); // 2
        System.out.println(vanKisbetu("alma")); // true
        System.out.println(vanKisbetu("ALmA")); // true
        System.out.println(vanKisbetu("ALMA")); // false
        System.out.println(vanKisbetu("")); // false
        System.out.println(vanKisbetu("123456")); // false
        System.out.println(getMeret(100)); // "XS"
        System.out.println(getMeret(150)); // "S"
        System.out.println(getMeret(156)); // "S"
        System.out.println(getMeret(160)); // "M"
        System.out.println(getMeret(166)); // "M"
        System.out.println(getMeret(170)); // "L"
        System.out.println(getMeret(176)); // "L"
        System.out.println(getMeret(180)); // "XL"
        System.out.println(getMeret(186)); // "XL"
        System.out.println(getMeret(190)); // "XXL"
        System.out.println(getMeret(200)); // "XXL"
        System.out.println(rubikKockaSzin(1)); // "yellow"
        System.out.println(rubikKockaSzin(2)); // "red"
        System.out.println(rubikKockaSzin(3)); // "orange"
        System.out.println(rubikKockaSzin(4)); // "white"
        System.out.println(rubikKockaSzin(5)); // "blue"
        System.out.println(rubikKockaSzin(6)); // "green"
        System.out.println(rubikKockaSzin(7)); // "invalid parameter"
        System.out.println(rubikKockaSzin(-1)); // "invalid parameter"
    }
}
