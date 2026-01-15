import java.util.Arrays;

public class majorityElement {

    // Majority Element using sorting
    public static int MajorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = MajorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
