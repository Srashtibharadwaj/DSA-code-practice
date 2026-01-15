import java.util.Map;

public class romanTOinteger {

    // Method to convert Roman numeral to integer
    public static int romanToInt(String s) {

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        String s = "MCMXCIV";

        int result = romanToInt(s);
        System.out.println("Roman: " + s);
        System.out.println("Integer: " + result);
    }
}

