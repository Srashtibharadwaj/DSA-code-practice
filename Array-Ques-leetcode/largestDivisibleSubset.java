import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;

        Arrays.sort(nums);

        int n = nums.length;
        int[] dp = new int[n];     // dp[i] = length of best subset ending at i
        int[] prev = new int[n];   // prev index to reconstruct subset

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxi = 0; // index of last element of max subset

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxi]) maxi = i;
        }

        // Reconstruct answer
        int k = maxi;
        while (k != -1) {
            res.add(nums[k]);
            k = prev[k];
        }

        Collections.reverse(res);
        return res;
    }
}
