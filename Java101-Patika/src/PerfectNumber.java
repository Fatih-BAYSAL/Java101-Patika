import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, total = 0;

        System.out.println("Lutfen Bir Sayi Giriniz : ");
        number = input.nextInt();

        for (int i =1; i <= number; i++) {

            if (number % i ==0) {
                if (i == number) {
                    continue;
                }

                total += i;
                System.out.println(" Carpan : " +i);
            }

        }

        System.out.println("Toplam  : " + total);

        if (total == number ) {
            System.out.println("Mukemel Sayidir !");
        }else {
            System.out.println("Mukemmel Sayi Degildir 1");
        }

    }
}
