import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        // Build pattern map
        Map<Character, String[]> patternMap = buildPatternMap();

        // Render banner word
        renderBanner("OOPS", patternMap);
    }

    // Store all character patterns inside HashMap
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return map;
    }

    // Function to render banner using map lookup
    public static void renderBanner(String word, Map<Character, String[]> map) {

        word = word.toUpperCase();  // Ensure correct lookup

        if (word.isEmpty()) {
            System.out.println("No word provided.");
            return;
        }

        // Get height dynamically from first character
        int height = map.get(word.charAt(0)).length;

        for (int row = 0; row < height; row++) {

            for (int col = 0; col < word.length(); col++) {

                char ch = word.charAt(col);

                if (map.containsKey(ch)) {
                    System.out.print(map.get(ch)[row] + "  ");
                } else {
                    System.out.print("        "); // space for unknown character
                }
            }

            System.out.println();
        }
    }
}