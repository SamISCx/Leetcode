class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp= new int[nums.length];
        int max=1;
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}