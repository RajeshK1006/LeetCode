// User function Template for Java

class Solution {
    boolean isSubSequence(String A, String B) {
        int a = 0;
        if(B.length()<A.length())return false;
        for(char ch:B.toCharArray()){
            
            if(a<A.length() && ch==A.charAt(a)){
                a++;
            }
        }
        
        if(a==A.length()){
            return true;
        }
        return false;
    }
}