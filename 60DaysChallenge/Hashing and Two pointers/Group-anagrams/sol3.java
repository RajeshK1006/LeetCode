class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List <List<String>> l = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        

        for(int i=0;i<strs.length;i++){

            char[] given = strs[i].toCharArray();
            Arrays.sort(given);
            String key = new String(given);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);

        }

        for (List<String> each : map.values()){
            l.add(each);
        }

        return l ;
        
    }
}
