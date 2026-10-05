class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        int n=heights.length;
        for(int i = 0;i<=n;i++){
            int h = (i == n ? 0 : heights[i]);
            while(!stack.isEmpty() && h < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max , width*height);
            }
            stack.push(i);
        }
        return max;
    }
}