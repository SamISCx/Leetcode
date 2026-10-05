class Solution {
    public boolean checkPossibility(int[] nums) {
        int ch=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(++ch>1) return false;
                if(i==0 || nums[i-1]<=nums[i+1]) nums[i] = nums[i+1];
                else nums[i+1]=nums[i];
            }
        }
        return true;
    }
}