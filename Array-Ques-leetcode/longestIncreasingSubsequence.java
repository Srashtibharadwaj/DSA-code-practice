class Solution {
    public int solve(int[] nums, int i){
        if(i == 0) return 1;
        
        int maxlen = 1;
        for(int j = i-1; j >= 0; j--){
            if(nums[j] < nums[i]){
                maxlen = Math.max(maxlen, 1 + solve(nums, j));
            }
        }
        return maxlen;
    }
    
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        
        int res = 1;
        for(int i = 0; i < n; i++){
            res = Math.max(res, solve(nums, i));
        }
        return res;
    }
}