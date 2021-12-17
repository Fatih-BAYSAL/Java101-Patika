package NumberGuessingGame;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5) {
            System.out.println("Lutfen Tahmininizi Giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lutfen 0 ile 100 Arasinda Sayi giriniz!");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Bir Dahaki Hatali Girisinizde Hakkinizdan Dusulecektir!");
                }else {
                    right++;
                    System.out.println("Cok Fazla Hatali Giris Yaptiniz! Kalan Hakkiniz : " + (5 - right));
                }
                continue;
            }


            if (selected == number) {
                System.out.println("Tebrikler, Dogru Tahmin Ettiniz! Tahmin Ettiginiz Sayi : " + number);
                isWin = true;
                break;
            }else {

                System.out.println("Hatali Bir Sayi Girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " Sayisi Gizli Sayidan Buyuktur.");
                }else {
                    System.out.println(selected + " Sayisi Gizli Sayidan Kucuktur!");
                }

                wrong[right++] = selected;
                System.out.println("Kalan Hakkiniz : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }
    }
}
