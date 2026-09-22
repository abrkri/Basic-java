import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Whiles {
    static void main() {
        List<Integer> l = new ArrayList<>();
        int db = 0;
        while (db < 2) {
            int rnd = (int)(Math.random() * 100);
            l.add(rnd);
            db++;
        }
        Collections.sort(l);
        IO.println(l);
    }
}
