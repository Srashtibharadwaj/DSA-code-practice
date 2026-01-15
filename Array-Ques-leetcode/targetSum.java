public class targetSum {
    
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return targetSum(0, nums, target, 0);
    }

    int targetSum(int p, int[] nums, int target, int index){
        if(index == nums.length){
            return (p == target) ? 1 : 0;
        }

        int count = 0;
        count += targetSum(p + nums[index], nums, target, index+1); // Plus Call
        count += targetSum(p - nums[index], nums, target, index+1); // Minus Call

        return count;
    }
}