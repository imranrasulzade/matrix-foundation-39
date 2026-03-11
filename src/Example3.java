import java.util.Scanner;

public class Example3 {

    public int factorial(int number) {
        if (number == 0 ||  number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int a(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static boolean isValidNumber(String number) {
        if (number.length() != 6) return false;

        return number.startsWith("+11");
    }

    public static void test(String a, int b) {
        System.out.println("aaaaa");
        System.out.println(a);
        System.out.println(b);
    }

    public static void test(int a, String b) {
        System.out.println("bbbbb");
        System.out.println(a);
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
    }

    public static String getName() {
        System.out.println("aaaaaaaaaaa");
        return "Imran";
    }

    public static void getName(int a) {
        System.out.println("aaaaaaaaaaa");
    }



    public static void main(String[] args) {

        Example3 e = new Example3();
        int factorial = e.factorial(6);
        System.out.println(factorial);

    }




}