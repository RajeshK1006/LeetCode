// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        String s = String.valueOf(n);
        int l =0;
        int r = s.length()-1;
        
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}