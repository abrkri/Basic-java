import java.util.HashMap;
import java.util.Map;
public class MapAvagyADictionary {
    static void main(String[] args) {
        MapIntroduction1();
        MapIntroduction2();
    }

    static void MapIntroduction1 () {
        HashMap<Integer, Character> hm1 = new HashMap<>();
        System.out.println(hm1.isEmpty());
        hm1.putAll(Map.of(97, 'a', 98, 'b', 99, 'c', 65, 'A', 66, 'B', 67, 'C'));
        System.out.println(hm1.keySet());
        System.out.println(hm1.values());
        hm1.put(68, 'D');
        System.out.println(hm1.size());
        System.out.println(hm1.get(99));
        hm1.remove(97);
        System.out.println(hm1.containsKey(100));
        hm1.clear();
        System.out.println(hm1.size());
    }

    static void MapIntroduction2() {
        HashMap<String, String> hm2 = new HashMap<>(Map.of("978-1-60309-452-8", "A Letter to Jo", "978-1-60309-459-7", "Lupus", "978-1-60309-444-3", "Red Panda and Moon Bear", "978-1-60309-461-0", "The Lab"));
        for (Map.Entry e : hm2.entrySet()) {
            System.out.println(e.getValue() + " ISBN: " + e.getKey() + ")");
        }
        hm2.remove("978-1-60309-444-3");
        hm2.values().remove("The Lab");
        hm2.putAll(Map.of("978-1-60309-450-4", "They Called Us Enemy", "978-1-60309-453-5", "Why Did We Trust Him?"));
        System.out.println(hm2.containsKey("478-0-61159-424-8"));
        System.out.println(hm2.get("978-1-60309-453-5"));
    }
}
