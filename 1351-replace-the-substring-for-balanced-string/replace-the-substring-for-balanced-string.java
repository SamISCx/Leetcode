class Solution {
    public int balancedString(String s) {
        int[] count= new int[128];
        int n=s.length();
        int target=n/4;
        for(char c:s.toCharArray()){
            count[c]++;
        }
        int left=0;
        int res=n;
        for(int right=0;right<n;right++){
            count[s.charAt(right)]--;
            while(count['Q']<=target && count['W']<=target && count['E']<=target && count['R']<=target && left<n){
                res=Math.min(res,right-left+1);
                count[s.charAt(left)]++;
                left++;
            }
        }
        return res;
    }
}