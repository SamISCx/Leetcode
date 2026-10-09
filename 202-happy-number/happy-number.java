class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        if(n==1){
            return true;
        }
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int k=n;
            int ans=0;
            while(k>0){
                int r=k%10;
                k=k/10;
                ans=ans+r*r;
            }
            n=ans;
        }
        return n==1; 
    }
}