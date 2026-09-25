class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0;i<s.length();i++){
            String p1=expand(s,i,i);
            String p2=expand(s,i,i+1);
            String current=p1.length()>p2.length()?p1:p2;
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        return longest;
    }
    private String expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}