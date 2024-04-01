import java.util.function.Function;

public class Habr_6_4 {

    public static <T> void fill(T[] array, Function<Integer, T> function) {
        for (int i = 0; i < array.length; i++) {
            array[i] = function.apply(i);
        }
    }

    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        fill(squares, integer -> integer * integer);
        for (Integer num : squares) {
            System.out.print(num + " ");
        }
    }
}