class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;
        String temp = "";
        while(l<word1.length() && r<word2.length()){
            temp+=word1.charAt(l);
            temp+=word2.charAt(r);
            l++;
            r++;
        }

        while(l<word1.length()){
            temp+=word1.charAt(l);
            l++;
        }

        while(r<word2.length()){
            temp += word2.charAt(r);
            r++;
        }

        return temp;

    }
}