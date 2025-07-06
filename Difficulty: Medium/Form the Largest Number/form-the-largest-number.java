// User function Template for Java

class Solution {
    String findLargest(int[] arr) {
        // code here
        String[] s = new String[arr.length];
        
        for(int i=0;i<arr.length;i++){
            s[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        
        if(s[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String st : s){
            sb.append(st);
        }
        
        return sb.toString();
    }
}