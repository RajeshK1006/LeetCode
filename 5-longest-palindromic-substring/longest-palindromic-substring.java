class Solution {
    public String longestPalindrome(String st) {
        int s = 0;
        int e = 0;
        for(int i=0;i<st.length();i++){
            int even = helper(st,i,i);
            int odd = helper(st,i,i+1);

            int len = Math.max(even, odd);

            if(len> e - s){
                s = i - (len - 1)/2;
                e = i+ (len/2);
            }

            
        }

        return st.substring(s,e+1);
    }

    int helper(String s, int l, int r ){
        while(l>=0 && r< s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        return r-l-1;
    }


}