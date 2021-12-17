import java.util.Scanner;

public class SumOfEnteredNumber {
    public static void main(String[] args) {

        int number;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lutfen Sayi Giriniz");
            number = input.nextInt();
            if (number % 2 == 1) {
                total += number;
            }
        }while (number > 0);

        System.out.println("Toplam : " +total);


    }
}
