class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int maxi = Integer.MIN_VALUE;
        for(int num: arr1){
            maxi = Math.max(maxi,num);
        }

        int[] cnt = new int[maxi+1];
        for(int num:arr1){
            cnt[num]++;
        }

        int[] ans = new int[arr1.length];
        int i =0;
        for(int num:arr2){
            while(cnt[num]>0){
                ans[i] = num;
                i++;
                cnt[num]--;
            }
        }

        for(int j=0;j<cnt.length;j++ ){
            while(cnt[j]>0){
                ans[i] = j;
                cnt[j]--;
                i++;
            }
        }

        return ans;
    }
}