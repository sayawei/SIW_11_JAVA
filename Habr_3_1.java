public class Habr_3_1 {
    public static void main(String[] args) {
        double a = 0;
        double b = 10;
        double epsilon = 0.001;

        double root = findRoot(a, b, epsilon);
        System.out.println("Root: " + root);
    }
    public static double findRoot(double a, double b, double epsilon) {
        double middle = (a + b) / 2;
        if (Math.abs(b - a) < epsilon) {
            return middle;
        }
        if (function(a) * function(middle) <= 0) {
            return findRoot(a, middle, epsilon);
        } else {
            return findRoot(middle, b, epsilon);
        }
    }
    public static double function(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }
}
