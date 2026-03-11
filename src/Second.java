import java.util.Arrays;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] array = new int [6][6];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i >= j) {
                    array[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
