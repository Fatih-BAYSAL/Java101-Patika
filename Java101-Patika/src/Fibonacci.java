import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0, b = 1, c, number;

        System.out.print("Lutfen Bir Sayi Giriniz : ");
        number = input.nextInt();

        do {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }while (c < number);

    }
}
