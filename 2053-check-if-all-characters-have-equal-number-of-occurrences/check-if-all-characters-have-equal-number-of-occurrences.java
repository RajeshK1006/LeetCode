class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);

        }

        int val = map.get(s.charAt(0));
        for(Map.Entry<Character, Integer> item : map.entrySet()){
            if (item.getValue() != val){
                return false;
            }
        }

        return true;
    }
}