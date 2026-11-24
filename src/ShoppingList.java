import java.util.LinkedList;
import java.util.List;

public class ShoppingList {
    static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>(List.of("eggs", "milk", "fish", "apples", "bread", "chicken"));

        System.out.println(hasItem(items, "milk"));
        System.out.println(hasItem(items, "bananas"));
    }
    static String hasItem(LinkedList<String> list, String item) {
        return list.contains(item) ? "yes" : "no";
    }
}
