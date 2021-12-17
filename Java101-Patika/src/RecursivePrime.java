import java.util.Scanner;

public class RecursivePrime {

    static boolean recursivePrime (int a, int b) {

        if (a == b || a == 1) {
            return true;
        }

        if (a % b == 0) {
            return false;
        }

        return recursivePrime(a, b + 1);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Sayi Giriniz : ");
        int number = input.nextInt();
        int i = 2;

        System.out.println(recursivePrime(number, i) ? "Asal!" : "Asal Degil!" );


    }
}
