import java.util.Random;

public class Habr_2_1 {
    private final int[] values;
    private final int[] weights;
    private final Random random;

    public Habr_2_1(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        this.random = new Random();
    }

    public int Habr_2_1() {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }

        int randomNumber = random.nextInt(totalWeight) + 1;
        int cumulativeWeight = 0;
        for (int i = 0; i < values.length; i++) {
            cumulativeWeight += weights[i];
            if (randomNumber <= cumulativeWeight) {
                return values[i];
            }
        }
        return values[values.length - 1];
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        int[] weights = {1, 2, 10};

        Habr_2_1 picker = new Habr_2_1(values, weights);

        // Test the picker
        for (int i = 0; i < 10; i++) {
            System.out.println("Randomly picked value: " + picker.Habr_2_1());
        }
    }
}