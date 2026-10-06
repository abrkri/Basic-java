import java.util.Arrays;

public class ArrayGyak {
    static void main() {

        // 1.

        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int max = 0;
        for (int i : arr) {
            if (i > max) max = i;
        }
        IO.println(max);

        // 2.

        int[] arrmerge1 = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int[] arrmerge2 = { 10, 324, 45, 90, 9808 };
        int [] arrmerged = new int [arrmerge1.length + arrmerge2.length];

        System.arraycopy(arrmerge1, 0, arrmerged, 0, arrmerge1.length);
        System.arraycopy(arrmerge2, 0, arrmerged, arrmerge1.length, arrmerge2.length);

        IO.println(Arrays.toString(arrmerged));


        // 3.

        int[] arravg = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        double avg = 0.00;

        for (int i : arravg) {
            avg += i;
        }

        IO.println(Math.round(avg / arravg.length * 100) / 100.00);

        // 4.

        int[] arrsecondlargest = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };

        Arrays.sort(arrsecondlargest);
        IO.println(arrsecondlargest[arrsecondlargest.length - 2]);

        // 5.

        String [] arrfizzbuzz = new String[100];

        for (int i = 0; i < arrfizzbuzz.length; i ++) {
            if (i % 3 == 0 && i % 5 == 0) arrfizzbuzz[i] = "FizzBuzz";
            else if (i % 3 == 0) arrfizzbuzz[i] = "Fizz";
            else if (i % 5 == 0) arrfizzbuzz[i] = "Buzz";
            else arrfizzbuzz[i] = Integer.toString(i);
        }

        for (int i = 0; i < arrfizzbuzz.length; i ++) {
            if (i % 15 == 1) IO.println();
            else IO.print(arrfizzbuzz[i] + "; ");
        }

        // vege
        }

    }
