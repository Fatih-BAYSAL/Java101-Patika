import java.util.Scanner;

public class FindingHoroscope {
    public static void main(String[] args) {

        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Dogdugunuz Ayi Giriniz :");
        month = input.nextInt();

        System.out.println("Lutfen Dogdugunuz Gunu Giriniz :");
        day = input.nextInt();

        switch (month) {
            // Ocak
            case 1:
                if (day >= 1 && day <= 31) {

                    if (day < 22) {
                        burc = "Oglak Burcu";
                    }else {
                        burc = "Kova Burcu";
                    }

                }else {
                    isError = true;
                }
                break;

            // Subat
            case 2:
                if (day >= 1 && day <= 28) {

                    if (day < 20) {
                          burc = "Kova Burcu";
                    }else {
                          burc = "Balik Burcu";
                    }

                }else {
                    isError = true;
                }
                break;

            // Mart
            case 3:
                if (day >= 1 && day <= 31) {

                    if (day < 21) {
                        burc = "Balik Burcu";
                    }else {
                        burc = "Koc Burcu";
                    }

                }else {
                    isError = true;
                }
                break;

            // Nisan
            case 4:
                if (day >= 1 && day <= 30) {

                    if (day < 20) {
                        burc = "Koc Burcu";
                    }else {
                        burc = "Boga Burcu";
                    }

                }else {
                    isError = true;
                }
                break;

            // Mayis
            case 5:
                if (day >= 1 && day <= 31) {

                    if (day < 22) {
                        burc = "Boga Burcu";
                    }else {
                        burc = "Ikizler Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            //Haziran
            case 6:
                if (day >= 1 && day <= 30) {

                    if (day < 22) {
                        burc = "Ikizler Burcu";
                    }else {
                        burc = "Yengec Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            //Temmuz
            case 7:
                if (day >= 1 && day <= 31) {

                    if (day < 22) {
                        burc = "Yengec Burcu";
                    }else {
                        burc = "Aslan Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            //Agustos
            case 8:
                if (day >= 1 && day <= 31) {

                    if (day < 22) {
                        burc = "Aslan Burcu";
                    }else {
                        burc = "Basak Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            //Eylul
            case 9:
                if (day >= 1 && day <= 30) {

                    if (day < 22) {
                        burc = "Basak Burcu";
                    }else {
                        burc = "Terazi Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            //Ekim
            case 10:
                if (day >= 1 && day <= 31) {

                    if (day < 22) {
                        burc = "Terazi Burcu";
                    }else {
                        burc = "Akrep Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            //Kasim
            case 11:
                if (day >= 1 && day <= 30) {

                    if (day < 22) {
                        burc = "Akrep Burcu";
                    }else {
                        burc = "Yay Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            //Aralik
            case 12:
                if (day >= 1 && day <= 31) {

                    if (day < 22) {
                        burc = "Yay Burcu";
                    }else {
                        burc = "Oglak Burcu";
                    }

                }else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.println("Hatali Giris Yaptiniz , Lutfen Tekrar Deneyiniz!");
        }else {
            System.out.println("Burcunuz : " +burc);
        }





    }
}
