import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen  Daire'nin Yari Capi Giriniz : ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Daire'nin Alani : " +alan);
        System.out.println("Daire'nin Cevresi : " +cevre);

    }
}
