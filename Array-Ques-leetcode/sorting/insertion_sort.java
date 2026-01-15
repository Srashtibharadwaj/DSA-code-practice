import java.util.Arrays;

public class insertion_sort {

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;

            
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }

            
            nums[prev + 1] = curr;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};

        insertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}

