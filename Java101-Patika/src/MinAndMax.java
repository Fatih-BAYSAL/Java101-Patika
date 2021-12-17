import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 0, max = 0, piece, number;

        System.out.print("Kac Adet Sayi Girecekseniz Lutfen Yaziniz : ");
        piece = input.nextInt();

        for (int i = 1; i <= piece; i++) {

            System.out.print(i + " . Sayiyi Giriniz :");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

        }

        System.out.println("En Buyuk Sayi : " +max);
        System.out.println("En Kucuk Sayi : " +min);

    }
}
