import java.util.*;

public class palindromePairs {

    public static List<List<Integer>> PalindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        if (words == null || words.length == 0) return res;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) map.put(words[i], i);

        if (map.containsKey("")) {
            int blankIdx = map.get("");
            for (int i = 0; i < words.length; i++) {
                if (i == blankIdx) continue;
                if (isPalindrome(words[i])) {
                    res.add(Arrays.asList(blankIdx, i));
                    res.add(Arrays.asList(i, blankIdx));
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            String curRev = reverseStr(words[i]);
            Integer found = map.get(curRev);
            if (found != null && found != i) res.add(Arrays.asList(i, found));
        }

        for (int i = 0; i < words.length; i++) {
            String cur = words[i];
            for (int cut = 1; cut < cur.length(); cut++) {
                if (isPalindrome(cur.substring(0, cut))) {
                    String rightRev = reverseStr(cur.substring(cut));
                    Integer found = map.get(rightRev);
                    if (found != null && found != i) res.add(Arrays.asList(found, i));
                }
                if (isPalindrome(cur.substring(cut))) {
                    String leftRev = reverseStr(cur.substring(0, cut));
                    Integer found = map.get(leftRev);
                    if (found != null && found != i) res.add(Arrays.asList(i, found));
                }
            }
        }

        return res;
    }

    private static String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcd","dcba","lls","s","sssll"};
        System.out.println(PalindromePairs(words)); // expected pairs like [0,1], [1,0], [3,2], [2,4]
    }
}
