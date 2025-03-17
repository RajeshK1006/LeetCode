class Solution {
    public int maxDistance(int[] colors) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<colors.length-1;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]) maxi = Math.max(maxi,Math.abs(j-i));
            }
        }
        return maxi;
    }
}