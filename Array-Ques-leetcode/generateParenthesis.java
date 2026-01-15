import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    // Main logic
    public static List<String> GenerateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    // Backtracking helper method
    private static void recurse(List<String> res, int left, int right, String s, int n) {

        // Base condition
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        // Add '(' if we still can
        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }

        // Add ')' only if it won't make it invalid
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 3;
        List<String> result = GenerateParenthesis(n);

        System.out.println("Generated Parentheses:");
        for (String str : result) {
            System.out.println(str);
        }
    }
}
