class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int first = arr[i];
            boolean flag = false;
            for(int j= i+1;j<arr.length ;j++){
                if(arr[j]>arr[i]){
                    arr[i] = arr[j];
                    flag = true;
                    break;
                }
                
                
                
            }
            
            if(!flag){
                arr[i] = -1;
            }
            
            
        }
        for(int num :arr){
            a.add(num);
        }
        
        return a;
        
    
        
    }
}