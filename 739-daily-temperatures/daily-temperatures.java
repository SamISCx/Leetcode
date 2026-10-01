class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
    }
}