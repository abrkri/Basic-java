import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PartyArrasAndDividable {

    public static String partyValidation(int girl, int boy) {
        if (boy == girl && boy + girl >= 20) return "The party is excellent!";
        else if (girl == 0) return "Sausage party";
        else if (boy + girl >= 20 && boy != girl) return "Quite a cool party!";
        else return  "Average party...";

    }

    public static int[] add(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int[] result = arr.clone();
                result[i] = num;
                return result;
            }
        }

        int[] result = Arrays.copyOf(arr, arr.length + 1);
        result[arr.length] = num;
        return result;
    }

    public static int[] insert(int[] arr, int index, int num) {
        if (index >= arr.length) {
            int[] result = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) result[i] = arr[i];
            result[arr.length] = num;
            return result;
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == index) result[i] = num;
            else result[i] = arr[i];
        }
        return result;
    }

    public static int[] remove(int[] arr, int num) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        if (index == -1) return arr;

        int[] result = new int[arr.length - 1];
        int ind = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) continue;
            result[ind] = arr[i];
            ind++;
        }
        return result;
    }

    public static int[] pop(int[] arr, int index) {
        if (arr.length == 0) return arr;
        if (index == arr.length) index--;
        if (index < 0 || index >= arr.length) return arr;

        int[] result = new int[arr.length - 1];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) continue;
            result[ind] = arr[i];
            ind++;
        }
        return result;
    }

    public static int dividable(int num, int fizz, int buzz) {
        if (num % fizz == 0 && num % buzz == 0) return fizz * buzz;
        else if (num % fizz == 0) return fizz;
        else if (num % buzz == 0) return  buzz;
        else return -1;
    }


    public static void main(String[] args) {
        System.out.println("PartyValidation");
        System.out.println(partyValidation(11, 11).equals("The party is excellent!"));
        System.out.println(partyValidation(11, 12).equals("Quite a cool party!"));
        System.out.println(partyValidation(9, 9).equals("Average party..."));
        System.out.println(partyValidation(9, 10).equals("Average party..."));
        System.out.println(partyValidation(0, 25).equals("Sausage party"));
        System.out.println("Arrays");
        System.out.println("Add");
        System.out.println(Arrays.toString(add(new int[] {1,2,0,4,5}, 3)).equals("[1, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(add(new int[] {1,0,0,4,5}, 3)).equals("[1, 3, 0, 4, 5]"));
        System.out.println(Arrays.toString(add(new int[] {}, 3)).equals("[3]"));
        System.out.println(Arrays.toString(add(new int[] {1,2,3,4,5}, 6)).equals("[1, 2, 3, 4, 5, 6]"));
        System.out.println("Insert");
        System.out.println(Arrays.toString(insert(new int[] {1,2,3,4,5}, 0, 6)).equals("[6, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(insert(new int[] {1,2,3,4,5}, 2, 6)).equals("[1, 2, 6, 4, 5]"));
        System.out.println(Arrays.toString(insert(new int[] {1,2,3,4,5}, 6, 2)).equals("[1, 2, 3, 4, 5, 2]"));
        System.out.println("Remove");
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 5)).equals("[1, 2, 3, 2, 1]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 2)).equals("[1, 3, 2, 1]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 3)).equals("[1, 2, 2, 1]"));
        System.out.println("Pop");
        System.out.println(Arrays.toString(pop(new int[] {1,2,3,4,5}, 5)).equals("[1, 2, 3, 4]"));
        System.out.println(Arrays.toString(pop(new int[] {1,2,3,4,5}, 3)).equals("[1, 2, 3, 5]"));
        System.out.println(Arrays.toString(pop(new int[] {}, 5)).equals("[]"));
        System.out.println("Dividable");
        System.out.println(dividable(24, 4, 5) == 4);
        System.out.println(dividable(30, 4, 5) == 5);
        System.out.println(dividable(40, 4, 5) == 20);
        System.out.println(dividable(54, 4, 5) == -1);
    }
}
