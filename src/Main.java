import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a-ni daxil et");
        int a = input.nextInt();

        String result = a == 10 ? "OK" : "NOT OK";

        System.out.println(result);


        System.out.println("Proqram bitti");


    }

}