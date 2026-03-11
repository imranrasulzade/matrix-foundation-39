import java.util.Arrays;
import java.util.Scanner;

public class Lesson8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int orjNumber = number;

        int len = 0;
        while (number > 0) {
            len++;
            number /= 10;
        }

        int[] digits = new int[len];
        for (int i = 0; i < len; i++) {
            digits[i] = orjNumber % 10;
            orjNumber /= 10;
        }

        int symmetry = 0;
        for (int i = 0; i < (digits.length + 1) / 2; i++) {
            if (digits[i] == digits[digits.length - 1 - i]) {
                symmetry++;
            }
        }

        System.out.println(symmetry);
        System.out.println("Salam");


    }
}
