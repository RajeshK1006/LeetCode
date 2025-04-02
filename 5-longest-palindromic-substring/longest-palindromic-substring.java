class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String res = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String val = s.substring(i,j+1);
                if(isPalin(val)){
                    if(val.length()>res.length()){
                        res = val;
                    }
                }
            }
        }

        return res;
    }

    boolean isPalin(String s){
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}