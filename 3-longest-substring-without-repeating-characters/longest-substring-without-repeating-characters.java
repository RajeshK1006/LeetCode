class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()<2){
            return s.length();
        }
        HashMap <Character, Integer> map = new HashMap<>();
        int maxi = 0;
        int l = 0;
        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                l = Math.max(l,map.get(s.charAt(i))+1);
                

            }
            maxi = Math.max(maxi, i-l+1);

            map.put(s.charAt(i),i);

        }

        return maxi;
        
    }
}