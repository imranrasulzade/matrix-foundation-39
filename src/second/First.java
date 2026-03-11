package second;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        boolean cont = true;

        while (cont) {
            System.out.println("""
                    1. Valyuta çevirici
                    2. Bədən kütlə indeksi (BMI)
                    3. Vergi hesablayıcı
                    4. Qiymət/Grade kalkulyatoru
                    5. Taksi haqqı hesablayıcı
                    6. Üçbucaq növü təyini
                    7. Dayandir
                    """);
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    double aznToUsd = 0.59;
                    double aznToEur = 0.54;
                    double usdToAzn = 1.7;
                    double eurToAzn = 1.85;

                    System.out.println("Fromu daxil et:");
                    String from = scanner.next();
                    System.out.println("To daxil et");
                    String to = scanner.next();
                    System.out.println("Meblegi daxil et:");
                    double source = scanner.nextDouble();

                    if (from.equals("AZN") && to.equals("USD")) {
                        System.out.println(source * aznToUsd);
                    } else if (from.equals("AZN") && to.equals("EUR")) {
                        System.out.println(source * aznToEur);
                    } else if (from.equals("USD") && to.equals("AZN")) {
                        System.out.println(source * usdToAzn);
                    } else if (from.equals("EUR") && to.equals("AZN")) {
                        System.out.println(source * eurToAzn);
                    } else {
                        System.out.println("Xeta: valyuta duz deyil");
                    }

                    break;
                case 2:
                    //bmi
                    break;
                case 3:
                    //vergi
                    break;
                case 4:
                    // grade
                    break;
                case 5:
                    // taxi
                    break;
                case 6:
                    System.out.println("Üçbucaq növü seçildi");
                    System.out.println("A-ni daxil et:");
                    double a = scanner.nextDouble();

                    System.out.println("B-ni daxil et:");
                    double b = scanner.nextDouble();

                    System.out.println("C-ni daxil et:");
                    double c = scanner.nextDouble();

                    if ((a + b > c) && (a + c > b) && (b + c > a)) {
                        if (a == b && b == c) {
                            System.out.println("Bərabər tərəflidir");
                        } else if (a == b && b != c || a == c && b != c || b == c && a != c) {
                            System.out.println("Bərabəryanlı üçbucaqdır");
                        } else {
                            System.out.println("Bərabər tərəfli deyil");
                        }
                    } else {
                        System.out.println("Xəta");
                    }
                    break;
                case 7:
                    // stop
//                    System.exit(0);
                    cont = false;
                    break;
                default:
                    System.out.println("Yanlis menu");
            }
        }


    }


}
