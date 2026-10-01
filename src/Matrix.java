import java.util.Scanner;

public class Matrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Oszlop: ");
        int col = sc.nextInt();
        IO.print("Sor: ");
        int row = sc.nextInt();
        int [][] matrix = new int [col][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                IO.print("Adat: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            IO.print(" | ");
            for (int j = 0; j < matrix[i].length; j++) {
                IO.print(matrix[i][j] + " | ");
            }
            IO.print("\n");
        }
    }
}
