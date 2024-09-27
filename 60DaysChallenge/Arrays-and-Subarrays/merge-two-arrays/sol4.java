class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int l = 0;
        int r = 0;
        List <Integer> arr = new ArrayList<>();

        while (l<n && r<m){
            if (nums1[l]<=nums2[r]){
                arr.add(nums1[l]);
                l+=1;

            }
            else{
                arr.add(nums2[r]);
                r+=1;
            }
        }

        while (l<n){
            arr.add(nums1[l]);
            l+=1;
        }

        while(r<m){
            arr.add(nums2[r]);
            r+=1;
        }

        for(int i=0;i<arr.size();i++){
            nums1[i] = arr.get(i);

        }
    }
}
