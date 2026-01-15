
import java.util.Arrays;

public class missingNumber {

    // Method to find the missing number
    public static int MissingNumber(int[] nums) {
        int n = nums.length;
        int[] v = new int[n + 1];

        // Fill array with -1
        Arrays.fill(v, -1);

        // Mark present numbers
        for (int num : nums) {
            v[num] = num;
        }

        // Find missing number
        for (int i = 0; i < v.length; i++) {
            if (v[i] == -1) {
                return i;
            }
        }
        return -1; // safety return
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        int result = MissingNumber(nums);
        System.out.println("Missing number: " + result);
    }
}
