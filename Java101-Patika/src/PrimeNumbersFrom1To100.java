import java.util.Scanner;

public class PrimeNumbersFrom1To100 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayac = 0;

        for (int sayi = 2; sayi <= 100; sayi++) {

            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }

            if (kontrol == 0) {
                System.out.println(sayi+"");
                sayac++;
            }

        }
    }
}
