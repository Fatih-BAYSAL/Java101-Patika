package Loop;

public class WhileTest {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Program Start");

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("Program Finish");


        System.out.println("----------------------------------------------");

        // Do-While

        int year = 2021;

        do {
            System.out.println(year);
            year++;
        }while (year < 2021);
    }
}
