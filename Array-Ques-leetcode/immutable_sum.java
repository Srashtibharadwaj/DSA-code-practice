public class immutable_sum {

    private int[] prefixSum;

    // ✅ Constructor name matches class name
    public immutable_sum(int[] nums) {
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    // ✅ Main method for testing
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};

        immutable_sum obj = new immutable_sum(nums);

        System.out.println(obj.sumRange(0, 2)); // Output: 9
        System.out.println(obj.sumRange(1, 2)); // Output: 8
    }
}


