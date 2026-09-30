class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        boolean[] remove = new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='('){
                stack.push(i);
            }
            else if(c==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    remove[i]=true;
                }
            }
        }
        while(!stack.isEmpty()){
            remove[stack.pop()]=true;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!remove[i]){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
