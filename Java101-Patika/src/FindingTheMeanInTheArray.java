public class FindingTheMeanInTheArray {
    public static void main(String[] args) {
        int[] list = {10,20,30,40,50,60};
        double average = 0.0;
        double sum = 0.0 ;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        average = sum / list.length;

        System.out.println(average);
    }
}
