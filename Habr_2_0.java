import java.util.Arrays;
import java.util.Random;

public class Habr_2_0 {
    private final double x;
    private final double y;
    private final double z;

    public Habr_2_0 (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dotProduct(Habr_2_0 other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Habr_2_0 crossProduct(Habr_2_0 other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Habr_2_0(newX, newY, newZ);
    }

    public double angleBetween(Habr_2_0 other) {
        double dotProduct = dotProduct(other);
        double thisLength = length();
        double otherLength = other.length();
        return Math.acos(dotProduct / (thisLength * otherLength));
    }

    public Habr_2_0 add(Habr_2_0 other) {
        return new Habr_2_0(x + other.x, y + other.y, z + other.z);
    }

    public Habr_2_0 subtract(Habr_2_0 other) {
        return new Habr_2_0(x - other.x, y - other.y, z - other.z);
    }

    public static Habr_2_0[] randomVectors(int n) {
        Random random = new Random();
        Habr_2_0[] vectors = new Habr_2_0[n];
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Habr_2_0(x, y, z);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Habr_2_0 vector1 = new Habr_2_0(1, 2, 3);
        Habr_2_0 vector2 = new Habr_2_0(4, 5, 6);

        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);
        System.out.println("Length of vector 1: " + vector1.length());
        System.out.println("Dot product of vector 1 and vector 2: " + vector1.dotProduct(vector2));
        System.out.println("Cross product of vector 1 and vector 2: " + vector1.crossProduct(vector2));
        System.out.println("Angle between vector 1 and vector 2: " + Math.toDegrees(vector1.angleBetween(vector2)));
        System.out.println("Sum of vector 1 and vector 2: " + vector1.add(vector2));
        System.out.println("Difference of vector 1 and vector 2: " + vector1.subtract(vector2));

        int n = 5;
        Habr_2_0[] randomVectors = Habr_2_0.randomVectors(n);
        System.out.println("Random vectors: " + Arrays.toString(randomVectors));
    }
}
