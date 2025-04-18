public class AverageDoubleArray {
    public static void main(String[] args) {
        double[] values = {10.5, 20.0, 30.5, 40.0};
        double sum = 0;

        for (double val : values) {
            sum += val;
        }

        double average = sum / values.length;
        System.out.println("Average: " + average);
    }
}
