import java.util.Scanner;

public class AdvancedCalculator {

    static int sum (int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " +result);
        return result;
    }

    static int minus (int a, int b) {
        int result = a - b;
        System.out.println("Cikarma : " +result);
        return result;
    }

    static int times (int a, int b) {
        int result = a * b;
        System.out.println("Carpma : " +result);
        return result;
    }

    static int divided (int a,int b) {
        if (b == 0) {
            return 0;
        }

        int result = a / b;
        System.out.println("Bolme : " +result);
        return result;
    }

    static int power (int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    static int mod (int a, int b) {
        return a % b;
    }

    static void calculator (int a, int b) {
        System.out.println("Cevresi : " +  (2 * (a + b)));
        System.out.println("Alani : " + (a * b));
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Tolama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Alma Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdortgen Alan Ve Cevre Hesaplama\n"
                + "0- Cikis Yap";

        System.out.println(menu);
        while (true) {

            System.out.print("Lutfen Bir Islem Seciniz :");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            System.out.println("Lutfen Ilk Sayiyi Giriniz : ");
            int a = input.nextInt();

            System.out.println("Lutfen Ikinci Sayiyi Giriniz : ");
            int b = input.nextInt();

            switch (select) {

                case 1:
                    sum(a,b);
                    break;

                case 2:
                    minus(a,b);
                    break;

                case 3:
                    times(a,b);
                    break;

                case 4:
                    if (divided(a,b) == 0) {
                        System.out.println("Ikinci Sayi 0 dan Farkli Olmalidir");
                    }
                    break;

                case 5:
                    System.out.println("Us Hesabi : " +power(a,b));
                    break;

                case 6:
                    System.out.println("Mod Islemi : " +mod(a,b));
                    break;

                case 7:
                    calculator(a,b);
                    break;

                default:
                    System.out.println("Gecersiz Bir Islem Girdiniz!");
            }
        }
    }
}
