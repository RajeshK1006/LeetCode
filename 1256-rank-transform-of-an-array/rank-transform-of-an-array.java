class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] brr = arr.clone();
        Arrays.sort(brr);
        int r = 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:brr){
            if(!map.containsKey(num)){
                map.put(num,r++);
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
       
    }
}