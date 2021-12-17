import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Ilk Sayiyi Giriniz : ");
        a = input.nextInt();

        System.out.println("Lutfen Ikinci Sayiyi Giriniz : ");
        b = input.nextInt();

        System.out.println("Lutfen Ucuncu Sayii Giriniz : ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {

            if (b > c){
                System.out.println("a > b > c");
            }else {
                System.out.println(" a > c > b");
            }
        }else if ((b > a) && (b > c)) {
            if (a > c){
                System.out.println(" b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        }else {
            if (a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }
    }
}
