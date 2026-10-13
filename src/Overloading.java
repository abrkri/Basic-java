import java.util.Arrays;

public class Overloading {
    // 1.
    static int  AddNumberToArraySum(int szam, int [] arr) {
        int sum = szam;
        for (int j : arr) sum += j;
        sum += szam;
        return  sum;
    }

    static double AddNumberToArraySum(double szam, double [] arr) {
        double sum = szam;
        for (double j : arr) sum += j;
        return sum;
    }

    // 2.

    static String UserData(int age, String firstName, String lastName) {
        return  firstName + " " + lastName + " " + age;
    }

    static String UserData(String firstName, int age, String lastName) {
        return  firstName + " " + lastName + " " + age;
    }

    static String UserData(String firstName, String lastName, int age) {
        return  firstName + " " + lastName + " " + age;
    }

    // 3.
    static String ConvertToString(int [] arr) {
        return Arrays.toString(arr);
    }

    static String ConvertToString(double [] arr) {
        return Arrays.toString(arr);
    }

    static String ConvertToString(boolean [] arr) {
        return Arrays.toString(arr);
    }

    static String ConvertToString(String [] arr) {
        return Arrays.toString(arr);
    }


    static void main() {
        int [] arr = {1, 2, 3};
        double [] arr2 = {1.2, 3.4, 5.6};
        IO.println(AddNumberToArraySum(3, arr));
        IO.println(AddNumberToArraySum(3.0, arr2));

        IO.println(UserData(30, "John", "Doe"));
        IO.println(UserData("John", 30, "Doe"));
        IO.println(UserData("John", "Doe", 30));

        int [] arrtostring1 = {1, 2, 3};
        double [] arrtostring2 = {1.2, 3.4, 5.6};
        boolean [] arrtostring3 = {true, false, true};
        String [] arrtostring4 = {"a", "b", "c"};

        IO.println(ConvertToString(arrtostring1));
        IO.println(ConvertToString(arrtostring2));
        IO.println(ConvertToString(arrtostring3));
        IO.println(ConvertToString(arrtostring4));
    }
}
