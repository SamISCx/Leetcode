class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        f(res,new ArrayList<>(),nums);
        return res;
    }
    private void f(List<List<Integer>> res, List<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num)){
                continue;
            }
            temp.add(num);
            f(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}