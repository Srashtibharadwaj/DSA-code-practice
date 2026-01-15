import java.util.ArrayList;
import java.util.List;

public class allDuplicate {

    // Method to find duplicates
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int x = Math.abs(nums[i]);

            // If already visited, it's a duplicate
            if (nums[x - 1] < 0) {
                ans.add(x);
            }

            // Mark as visited
            nums[x - 1] = -nums[x - 1];
        }
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicate elements: " + duplicates);
    }
}
