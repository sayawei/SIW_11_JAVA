import java.util.Arrays;

public class Habr_1_0 {
    public static void main(String[] args) {
        int size = 10;

        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Math.random();
        }

        System.out.println("An array of random numbers:");
        System.out.println(Arrays.toString(numbers));

        double max = Arrays.stream(numbers).max().getAsDouble();

        double min = Arrays.stream(numbers).min().getAsDouble();

        double average = Arrays.stream(numbers).average().getAsDouble();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("The average value: " + average);
    }
}