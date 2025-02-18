class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
            char ch = (char) ('a' + i);
            map.put(ch,0);
        } 
        for(int i=0;i<sentence.length();i++){
            map.put(sentence.charAt(i),map.get(sentence.charAt(i))+1);
        }

        for(Map.Entry<Character, Integer> item : map.entrySet()){
            if (item.getValue() < 1){
                return false;
            }
        }
        return true;
    }
}