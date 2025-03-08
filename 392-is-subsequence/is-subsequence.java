class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int l = 0;
        int r = 0;
        while(r<t.length()){
            if(s.charAt(l)==t.charAt(r)){
                l++;
            }
            r++;

            if (l==s.length()){
                return true;
            }
        }

        return false;

    }
}