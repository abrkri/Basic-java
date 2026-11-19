import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListek {
    static void main (String[] args) {
        // ListIntroduction1();
        // ListIntroduction2();
        ListIntroduction3();
    }

    static void ListIntroduction1 () {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String name : names) System.out.println(name);
        for (String name : names) System.out.println(names.indexOf(name) + 1 + ". " + name);
        names.remove(1);
        for (int i = names.size() - 1; i >= 0; i--) System.out.println(names.get(i));
        names.clear();
        System.out.println(names.size());

    }

    static void ListIntroduction2 () {
        List<String> A = new ArrayList<>(List.of("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        List<String> B = new ArrayList<>(A);
        System.out.println(A.contains("Durian"));
        B.remove("Durian");
        A.add(4, "Kiwifruit");
        System.out.println(A.size() == B.size());
        System.out.println(A.indexOf("Avocado"));
        System.out.println(B.indexOf("Durian"));
        B.addAll(List.of("Passion fruit", "Pomelo"));
        System.out.println(A.get(2));
        System.out.println(A);
        System.out.println(B);
    }

    static void ListIntroduction3 () {
            List<Integer> nums = new ArrayList<>(List.of(500, 1000, 1250, 175, 800, 120));

    }
}

