import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        double boy, kg, vkitle;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lutfen Kilonuzu Giriniz : ");
        kg = input.nextDouble();

        vkitle = kg / (boy * boy) ;

        System.out.println("Vucut Kitle Endeksiniz : " +vkitle);




    }
}
