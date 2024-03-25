public class Habr_1_2 {
    public static void main(String[] args) {
        System.out.print("Prime numbers in the range from 2 to 100: ");
        StringBuilder primeNumbers = new StringBuilder();

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.append(i).append(" ");
            }
        }

        System.out.println(primeNumbers);
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
