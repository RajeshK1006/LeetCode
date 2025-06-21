// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int cnt = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length - 2;i++){
            for(int j=i+1;j<arr.length -1;j++){
                for(int k= j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]>arr[k]){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}