import java.util.Scanner;

public class CalculatingExponents {
    public static void main(String[] args) {

        int n, k;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Ussu Alinacak Sayiyi Giriniz : ");
        n = input.nextInt();

        System.out.println("Lutfen Us Olacak Sayiyi Giriniz : ");
        k = input.nextInt();

        int total = 1;

        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }

        System.out.println("Sonuc : " + total);



    }
}
