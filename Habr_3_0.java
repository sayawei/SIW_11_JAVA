import java.util.Arrays;
import java.util.Random;

public class Habr_3_0 {
    public static void main(String[] args) {
        int[] arr = createArray(100000000);
        int target = 99999999;
        long startTime = System.nanoTime();
        boolean linearResult = linearSearch(arr, target);
        long linearTime = System.nanoTime() - startTime;

        System.out.println("Linear search: " + linearResult);
        System.out.println("Linear search execution time: " + linearTime + " nanoseconds");

        Arrays.sort(arr);
        startTime = System.nanoTime();
        boolean binaryResult = binarySearch(arr, target);
        long binaryTime = System.nanoTime() - startTime;

        System.out.println("Binary search: " + binaryResult);
        System.out.println("Binary search execution time: " + binaryTime + " nanoseconds");
    }
    public static int[] createArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}