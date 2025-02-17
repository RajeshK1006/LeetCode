class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();
        if (numRows==0){
            return outer;
        }

        outer.add(Arrays.asList(1));
        if(numRows==1){
            return outer;
        }

        for(int i=1;i<numRows;i++){
            List<Integer> prev = outer.get(i-1);
            List<Integer> inner = new ArrayList<>();
            inner.add(1);
            for(int j=1;j<i;j++){
                inner.add(prev.get(j) + prev.get(j-1));
            }
            inner.add(1);

            outer.add(inner);
        }

        return outer;

    }
}