interface Filter {
    boolean apply(Object o);
}

public class Habr_6_3_Filter {

    public static Object[] filter(Object[] array, Filter filter) {
        int count = 0;
        for (Object obj : array) {
            if (filter.apply(obj)) {
                count++;
            }
        }
        Object[] result = new Object[count];
        int index = 0;
        for (Object obj : array) {
            if (filter.apply(obj)) {
                result[index++] = obj;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "pear", "grape"};
        Filter filter = new Filter() {
            @Override
            public boolean apply(Object o) {
                String str = (String) o;
                return str.length() > 5;
            }
        };
        Object[] filteredStrings = filter(strings, filter);
        for (Object str : filteredStrings) {
            System.out.println(str);
        }
    }
}
