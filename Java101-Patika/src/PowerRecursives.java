import java.util.Scanner;

public class PowerRecursives {

    static int powerRecursive (int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }else if (base == 1) {
            return 1;
        }else {
            return base * powerRecursive(base, exponent - 1);
        }




    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Taban Degerini Giriniz : ");
        int base = input.nextInt();

        System.out.println("Lutfen Us Degerini Giriniz : ");
        int exponent = input.nextInt();

        System.out.println(powerRecursive(base, exponent));


    }
}
