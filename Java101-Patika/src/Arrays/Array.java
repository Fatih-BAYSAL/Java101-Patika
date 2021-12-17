
package Arrays;
import java.util.Arrays;
public class Array {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        //-------------TEK BOYUTLU DIZILER--------------\\

        //Arrays genel kullanimi
        int[] list = {12,13,14,15,16,17,18,19,20};
        printArray(list);

        //Bir diger kullanimi, boyut vermek zorundayiz(hafizada ne kadar yer kaplayacak)
        int[] list2 = new int[10];
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        list[4] = 50;
        list[5] = 60;

        double[] list3 = {1.1,1.2,1.4,2.1};

        String[] days = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma"};

        // .lenght dizinin boyutunu belirtir.
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }

        System.out.println(list2[0]);

        //----------COK BOYUTLU DIZILER------------\\

        // Row = Satir(yatay)    column = Sutun(dikey)  =int[][]=  Ilk [] => satiri temsil eder , Ikinci [] => sutunu temsil eder.
        // Dizinin satir sayisina erismek icin dizininadi.lenght  , sutun sayisina erismek icin dizininadi[0].lenght

        int[][] matris = new int[6][6];
        matris[0][0] = 0;
        matris[2][3] = 839;

        System.out.println(matris[2][3]);

        int[][] matrix = {
                {0,453,939,243,324,768},
                {2,31,456,456,767,888},
                {56,123,4287,987,777,988},
                {324,71,234,346,467,808}
        };

        System.out.println(matrix[0][3]);

        int[][] number = new int[3][4];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                System.out.println(number[i][j]);
            }
        }

        //------------------------------------------------------------------------\\

        //Dizilerde Foreach Kullanimi
        // for (veritipi degisken: dizi adi) {}, daha hizli ulasmak icin kullanilir...

        int[] myList = {1,2,3,4,5,6};

        for (int i: myList) {
            System.out.println(i);
        }


        int[][] matrixx = {

                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };

        for (int[] row: matrixx) {
            for (int col: row) {
                System.out.println(col);
            }
        }


        //------------- Arrays Sinifi Ve Metodlari ------------------\\

        // Array metodunu kullanmak icin => import java.util.Arrays; metodunu kullaniyoruz..// statik metodlardir..

        // Arrays.toString() methodu diziye ait elemanlari direk ekrana basmak icin kullanilir.

        int[] list6 = {12,13,14,15,16,17};
        System.out.println(Arrays.toString(list6));

        //Arrays.fill() methodu ile dizilerimizin belirli bolumlerine egerler atayabiliriz..

        int[] list7 = {12,13,14,15,16};
        Arrays.fill(list7,10); // dizinin icindeki tum elemanlari 10 yapti..

        //Arrays.sort() metodu ile dizilerdeki elemanlari sirayla siralamamizi saglar..

        int[] list8 = {12,13,-1,-998,-876,34,35};
        Arrays.sort(list8);

        //Arrays.binarySearch() methodu dizideki bir elemanin indis degerini bulmak icin kullaniriz,fakat bu methodu kullanabilmek icin dizinin sirali olmasi gerekmektedir.

        int[] list9 = {12,13,-1,-998,-876,34,3512,13,-1,-998,-876,34,35}; // bu dizideki bir elmani bulamk icin ilk once diziyi siralamamiz geregir bunuda sort methodu ile yapariz.
        Arrays.sort(list9);
        System.out.println(Arrays.binarySearch(list9,35));


        // Arrays.copyOf() ve Arrays.copyOfRange() metodlari ile kopyalama islemleri yapariz

        int[] list10 = {12,13,-1,-998,-876,34,3512,13,-1,-998,-876,34,35};
        int[] copyOfList = Arrays.copyOf(list10,5);

        int[] list11 = {12,13,-1,-998,-876,34,3512,13,-1,-998,-876,34,35};
        int[] copyRangeList = Arrays.copyOfRange(list11,3,6);


        //Arrays.equals() methodu ile iki dizinin esitligini kontrol etmek istedigimizde kullaniriz..

        int[] equ = {1,2,3,4};
        int[] equ1 = {1,2,3,4};
        int[] equ3 = {3,7,6,5};

        System.out.println(Arrays.equals(equ,equ1)); //true
        System.out.println(Arrays.equals(equ,equ3)); //false

    }
}
