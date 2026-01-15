import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {

    // Group Anagrams logic
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);                 // sort characters
            String sortedWord = new String(chars);

            // add list if key not present
            map.putIfAbsent(sortedWord, new ArrayList<>());

            // add original word
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
