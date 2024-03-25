import java.util.Arrays;

public class Habr_1_1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 9};

        bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
