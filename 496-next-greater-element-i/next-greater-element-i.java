class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> nge = new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=m-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                stack.pop();
            }
            int val =  stack.isEmpty() ? -1 : stack.peek();
            nge.put(nums2[i],val); 
            stack.push(nums2[i]);
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i]=nge.get(nums1[i]);
        }
        return res;
    }
}