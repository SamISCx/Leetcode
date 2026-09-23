class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int count=0;
        int cost=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            cost+=Math.abs(s.charAt(right)-t.charAt(right));
            while(cost>maxCost){
                cost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            count=Math.max(count,right-left+1);
            right++;
        }
        return count;
    }
}