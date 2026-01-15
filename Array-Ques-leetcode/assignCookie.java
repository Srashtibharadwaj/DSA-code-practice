import java.util.Arrays;

public class assignCookie {

    // Greedy approach
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // index for cookies
        int j = 0; // index for children

        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                j++; // child is satisfied
            }
            i++; // move to next cookie
        }
        return j;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] g = {1, 2, 3};   // greed factors
        int[] s = {1, 1};     // cookie sizes

        int result = findContentChildren(g, s);
        System.out.println("Maximum content children: " + result);
    }
}
