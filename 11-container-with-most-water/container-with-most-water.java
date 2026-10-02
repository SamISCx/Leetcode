class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxh=0;
        while(i<j){
            int width=j-i;
            int h=Math.min(height[j],height[i]);
            int area=width*h;
            maxh=Math.max(area,maxh);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxh;
    }
}