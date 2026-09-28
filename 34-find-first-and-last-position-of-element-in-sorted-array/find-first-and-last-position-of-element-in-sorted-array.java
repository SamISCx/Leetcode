class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=f(nums,target);
        int last=l(nums,target);
        return new int[]{first,last};
    }
    private static int f(int[] nums, int target){
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                ans=mid;
                j=mid-1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    private static int l(int[] nums, int target){
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                ans=mid;
                i=mid+1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
}