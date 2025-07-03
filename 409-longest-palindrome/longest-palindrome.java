class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int l = 0;
        boolean odd = false;
        for(int num : map.values()){
            if(num%2==0){
                l+=num;
            }
            else{
                odd = true;
                l+= (num -1);
            }

        }

        if(odd){
            l+=1;
        }

        return l;

       

    }
}