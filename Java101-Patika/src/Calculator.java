import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Ilk Sayiyi Giriniz : ");
        n1 = input.nextInt();

        System.out.println("Lutfen Ikinci Sayiyi Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Lutfen Seciminizi Giriniz : ");

        select = input.nextInt();


        if (select == 1){
            System.out.println("Toplam : " + (n1 + n2));
        }else if (select == 2){
            System.out.println("Cikartma : " + (n1 - n2));
        }else if (select == 3){
            System.out.println("Carpma : " + (n1 * n2));
        }else if (select == 4){
            System.out.println("Bolme : " + (n1 / n2));
        }else{
            System.out.println("Yanlis Secim Yaptiniz! Tekrar Deneyiniz.");
        }



    }
}
