class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> outer  = new ArrayList<>();
        int mini  = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            int diff = Math.abs(arr[i-1]-arr[i]);
            if(diff<mini){
                outer.clear();
                mini = diff;
            }

            if(diff==mini){
                List<Integer> inner = Arrays.asList(arr[i-1],arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}