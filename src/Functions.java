import java.util.Arrays;
import java.util.Scanner;

public class Functions {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.print("Szám: ");

        String[] arr = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};

        int szam = sc.nextInt();
        IO.println("1. " + gausSum(szam));
        IO.println("2. " + factorial(szam));
        IO.println("3. " + fibonacci(szam));
        IO.println("4. " + Arrays.toString(appendAFunc(arr)));

    }

    // 1.

    public static int gausSum(int szam) {
        int res = 0;
        for (int i = 0; i < szam; i ++) {
            res += i;
        }
        return res;
    }

    // 2.

    public static int factorial(int szam) {
        int res = 1;
        for (int i = 2; i < szam; i ++) {
        res = res * i;
        }
        return res;
    }

    // 3.

    public static int fibonacci(int szam) {
        int fibonacci = 0;
        int next = 1;
        for (int i = 2; i <= szam; i ++) {
            int temp = fibonacci + next;
            fibonacci = next;
            next = temp;
        }
        return fibonacci;
    }

    // 4.

    public static String[] appendAFunc(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + "a";
        }
        return arr;
    }

}
