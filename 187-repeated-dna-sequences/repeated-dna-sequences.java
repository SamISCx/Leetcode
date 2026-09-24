class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> Seen = new HashSet<>();
        Set<String> repeated =  new HashSet<>();
        for(int i=0;i+10<=s.length();i++){
            String sub=s.substring(i,i+10);
            if(!Seen.add(sub)){
                repeated.add(sub);
            }
        }
        return new ArrayList<>(repeated);
    }
}