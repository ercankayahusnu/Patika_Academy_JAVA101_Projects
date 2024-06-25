import java.util.Arrays;

public class DizilerdeHarmonikSayiHesaplayanProgram {
    public static void main(String[] args) {

        double[] array = {1.0, 2.0, 4.0, 8.0,9.0};
        double harmonicMean = calculateHarmonicMean(array);
        System.out.println("Dizinin Harmonik Ortalaması: " + harmonicMean);
    }

    public static double calculateHarmonicMean(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += 1.0 / num;
        }
        return array.length / sum;
    }
}
