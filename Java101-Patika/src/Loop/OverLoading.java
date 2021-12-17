package Loop;

public class OverLoading {

    static void print () {
        System.out.println("Parametrsiz Method");
    }

    static void print (int a) {
        System.out.println("Parametreli Method : " + a);
    }

    static int print (int a, int b) {
        return a + b;
    }






    public static void main(String[] args) {

        print();
        print(10);
        System.out.println(print(5,3));

    }
}
