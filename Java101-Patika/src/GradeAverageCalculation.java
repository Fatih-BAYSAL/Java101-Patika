import java.util.Scanner;

public class GradeAverageCalculation {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Matematik Notunuzu Giriniz : ");
        matematik = input.nextInt();

        System.out.println("Lutfen Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.println("Lutfen Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.println("Lutfen Turkce Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.println("Lutfen Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();

        System.out.println("Lutfen Muzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;


        if (sonuc < 60) {
            System.out.println("Gecemediniz!");
        }else{
            System.out.println("Gectiniz!");
        }

        System.out.println("Not Ortalamaniz : " +sonuc);

    }
}
