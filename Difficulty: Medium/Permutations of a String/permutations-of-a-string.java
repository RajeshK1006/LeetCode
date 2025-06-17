class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        String res = "";
        Set<String> arr = new HashSet<>();
        helper(res, s, arr);
        return new ArrayList<>(arr);
    }
    
    void helper(String prev, String rem, Set<String> arr){
        if(rem.length() == 0){
            arr.add(prev);
            return;
        }
        
        for(int i=0;i<rem.length();i++){
            String next = prev + rem.charAt(i);
            String nextRem = rem.substring(0,i)+rem.substring(i+1,rem.length());
            helper(next, nextRem,arr);
        }
    }
}