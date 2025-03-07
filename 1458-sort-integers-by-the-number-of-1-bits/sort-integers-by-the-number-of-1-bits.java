class Solution {
    public int[] sortByBits(int[] arr) {
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = countBits(arr[i]) * 10001 + arr[i];
        } 
        Arrays.sort(res);
        for(int i=0;i<arr.length;i++){
            res[i] = res[i] % 10001;
        }

        return res;
    }

    int countBits(int n){
        int res = 0;
        while(n!=0){
            res += (n&1) ;
            n >>= 1;

        }
        return res;
    }
}