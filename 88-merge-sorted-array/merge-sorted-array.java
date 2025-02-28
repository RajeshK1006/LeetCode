class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l =0; 
        int r = 0;

        List<Integer> arr = new ArrayList<>();

        while(l<m  & r <n){
            if(nums1[l]<=nums2[r]){
                arr.add(nums1[l]);
                l++;
            }
            else{
                arr.add(nums2[r]);
                r++;
            }
        } 

        while(l<m){
            arr.add(nums1[l]);
            l++;
        }

        while(r<n){
            arr.add(nums2[r]);
            r++;
        }


        for(int i=0;i<nums1.length;i++){
            nums1[i] = arr.get(i);
        }
        
    }
}