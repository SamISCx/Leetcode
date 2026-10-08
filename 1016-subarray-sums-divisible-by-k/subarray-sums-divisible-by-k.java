class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainder=new int[k];
        remainder[0]=1;
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            int r=sum%k;
            if(r<0){
                r+=k;
            }
            count+=remainder[r];
            remainder[r]++;
        }
        return count;
    }
}