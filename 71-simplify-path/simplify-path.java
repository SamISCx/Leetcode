class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack <String>  stack = new Stack<>();
        for(String s:parts){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s);
            }
        }
        return "/" + String.join("/", stack);
    }
}