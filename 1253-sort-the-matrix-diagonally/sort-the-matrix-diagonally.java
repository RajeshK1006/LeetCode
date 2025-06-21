class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key = i-j;
                List<Integer> values = map.getOrDefault(key,new ArrayList<>());
                values.add(mat[i][j]);
                map.put(key,values);
            }
        }

        for(List<Integer> l : map.values()){
            Collections.sort(l);
        }
        System.out.println(map);

        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                int key = i-j;
                mat[i][j] = map.get(key).get(0);
                map.get(key).remove(0);
                
            }
        }

        return mat;
    }
}