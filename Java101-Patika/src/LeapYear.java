import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Yili Giriniz : ");
        year = input.nextInt();


        if (year%4==0) {
            System.out.println(year + " Artik Yildir!");
        }else {
            System.out.println(year + " Artik Yil Degildir!");
        }



    }
}
