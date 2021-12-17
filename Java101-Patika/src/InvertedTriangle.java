import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Basamak Sayisini Giriniz : ");
        int step = input.nextInt();

        for (int i = step; i >= 1; i--) {

            for (int j = 1; j <= step - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
