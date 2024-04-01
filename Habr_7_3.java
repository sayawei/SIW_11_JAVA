import java.util.Iterator;

public class Habr_7_3<T> implements Iterator<T> {
    private T[] array;
    private int currentIndex;

    public Habr_7_3(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        return array[currentIndex++];
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Habr_7_3<Integer> iterator = new Habr_7_3<>(numbers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
