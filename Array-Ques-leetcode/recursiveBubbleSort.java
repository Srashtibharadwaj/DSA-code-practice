import java.util.Arrays;

class recursiveBubbleSort {

    public int[] bubbleSort(int[] nums) {
        bubble(nums, nums.length);
        return nums;
    }

    private void bubble(int[] nums, int n) {

        if (n == 1) {
            return;
        }

        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                swapped = true;
            }
        }

        if (!swapped) {
            return;
        }


        bubble(nums, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};

        recursiveBubbleSort obj = new recursiveBubbleSort();
        obj.bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}



