   // Java utilities (optional but safe to include)

public class largestnum {

    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (int n : nums) {

            // Skip duplicates
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } 
            else if (second == null || n > second) {
                third = second;
                second = n;
            } 
            else if (third == null || n > third) {
                third = n;
            }
        }

        // If third maximum doesn't exist, return maximum
        return third == null ? first : third;
    }

    // ✅ Main method for testing
    public static void main(String[] args) {
        largestnum obj = new largestnum();

        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};

        System.out.println(obj.thirdMax(nums1)); // Output: 1
        System.out.println(obj.thirdMax(nums2)); // Output: 2
        System.out.println(obj.thirdMax(nums3)); // Output: 1
    }
}
