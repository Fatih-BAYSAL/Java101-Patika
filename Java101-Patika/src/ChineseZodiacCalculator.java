import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        int year,zodiac;
        String sZodiac = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Dogum Yilinizi Giriniz : ");
        year = input.nextInt();

        zodiac = year % 12;

        switch (zodiac) {

            case 0:
                sZodiac = "Maymun";
                break;

            case 1:
                sZodiac = "Horoz";
                break;

            case 2:
                sZodiac = "Kopek";
                break;

            case 3:
                sZodiac = "Domuz";
                break;

            case 4:
                sZodiac = "Fare";
                break;

            case 5:
                sZodiac = "Okuz";
                break;

            case 6:
                sZodiac = "Kaplan";
                break;

            case 7:
                sZodiac = "Tavsan";
                break;

            case 8:
                sZodiac = "Ejderha";
                break;

            case 9:
                sZodiac = "Yilan";
                break;


            case 10:
                sZodiac = "At";
                break;


            case 11:
                sZodiac = "Koyun";
                break;

            default:
                System.out.println("Hatali Giris Yaptiniz, Tekrar Deneyiniz!");

        }

        System.out.println("Cin Zodyagi Burcunuz : " +sZodiac);

    }
}
