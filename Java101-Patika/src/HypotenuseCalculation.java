import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Birinci Kenari Giriniz :");
        a = input.nextInt();

        System.out.println("Lutfen Ikinci Kenari Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus'un Degeri : " +c);




    }
}
