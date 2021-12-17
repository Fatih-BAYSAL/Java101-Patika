import java.util.Scanner;

public class EbobAndEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen N1 Sayisini Giriniz : ");
        int n1 = input.nextInt();

        System.out.print("Lutfen N2 Sayisini Giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;


        for (int i = 1; i <= n1; i++) {
            if (n1 % i ==0 && n2 % i ==0) {
                ebob = i;
            }
        }


        for (int i = 1; i <= (n1 * n2); i++ ) {
            if (i % n1 ==0 && i % n2 ==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
