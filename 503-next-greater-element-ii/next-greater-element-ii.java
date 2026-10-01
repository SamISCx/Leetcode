class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        int[] res = new int[2 * n];   
        for(int i = 2*n - 1; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = res[i];
        }
        return ans;
    }
}
