import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Kullanici Adinizi Giriniz : ");
        userName = input.nextLine();

        System.out.println("Lutfen Sifrenizi Giriniz : ");
        password = input.nextLine();


        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris Yaptiniz!");
        }else{
            System.out.println("Yanlis Bilgi Girdiniz!");
        }




    }
}
