import java.util.Arrays;

public class relativeRank {

    // Method to find relative ranks
    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;

        // Pair: {originalIndex, score}
        int[][] sortedPairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            sortedPairs[i][0] = i;
            sortedPairs[i][1] = score[i];
        }

        // Sort by score descending
        Arrays.sort(sortedPairs, (a, b) -> Integer.compare(b[1], a[1]));

        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {
            int index = sortedPairs[i][0];

            if (i == 0) {
                ans[index] = "Gold Medal";
            } else if (i == 1) {
                ans[index] = "Silver Medal";
            } else if (i == 2) {
                ans[index] = "Bronze Medal";
            } else {
                ans[index] = String.valueOf(i + 1);
            }
        }
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};

        String[] result = findRelativeRanks(score);

        System.out.println("Relative Ranks:");
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
