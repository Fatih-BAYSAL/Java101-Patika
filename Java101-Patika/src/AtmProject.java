import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
            userName = input.nextLine();

            System.out.print("Lutfen Parolanizi Giriniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba! Kodluyoruz Bankasina Hosgeldinz!");
                do {
                   System.out.println("1- Para Yatirma\n" + "2- Para Cekme\n" + "3- Bakiye Sorgula\n" + "4- Cikis Yap");
                   System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
                   select = input.nextInt();
                   if (select == 1) {
                       System.out.print("Lutfen Para Miktarini Giriniz : ");
                       int price = input.nextInt();
                       balance += price;
                   }else if (select == 2) {
                       System.out.print("Lutfen Para Miktarini Giriniz : ");
                       int price = input.nextInt();
                       if (price > balance) {
                           System.out.println("Yetersiz Bakiye!");
                       }else {
                           balance -= price;
                       }
                   }else if (select == 3) {
                       System.out.println("Bakiyeniz : " + balance);
                   }
                }while (select != 4);
                System.out.println("Tekrar Gorusmek Uzere!");
                break;
            }else {
                right--;
                System.out.println("Hatali Kullanici Adi Veya Sifre, Tekrar Deneyiniz!");
                if (right == 0){
                    System.out.println("Hesabiniz Bloke Olmustur, Lutfen Banka Ile Iletisime Geciniz!");
                }else {
                    System.out.println("Kalan Hakkiniz : " + right);
                }

            }

        }

    }
}
