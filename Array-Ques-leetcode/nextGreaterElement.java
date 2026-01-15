import java.util.*;

public class nextGreaterElement {

    private static int[] getNGR(int[] nums2) {
        int n2 = nums2.length;
        Stack<Integer> stack = new Stack<>();
        int[] ngrIndex = new int[n2];

        for (int i = n2 - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] >= nums2[stack.peek()]) {
                stack.pop();
            }
            ngrIndex[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ngrIndex;
    }

    public static int[] NextGreaterElement(int[] nums1, int[] nums2) {
        int[] ngrIndex = getNGR(nums2);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], ngrIndex[i] == -1 ? -1 : nums2[ngrIndex[i]]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(NextGreaterElement(nums1, nums2))); // [-1, 3, -1]
    }
}
