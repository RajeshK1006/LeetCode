/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int index = 0;
        while(index<a.length && index<b.length){
            if(a[index]!=b[index]) return index;
            else{
                index++;
            }
        }
        
        return index;
    }
}