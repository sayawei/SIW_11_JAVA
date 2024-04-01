import java.util.HashMap;
import java.util.Map;

public class Habr_7_0 {
    public static void main(String[] args) {
        String text = "This is a my code";

        text = text.toLowerCase();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + ": " + frequencyMap.getOrDefault(c, 0));
        }
    }
}