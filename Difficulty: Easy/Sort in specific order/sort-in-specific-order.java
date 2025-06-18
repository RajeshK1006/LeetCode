// User function Template for Java

class Solution {

    public void sortIt(Long arr[]) {
        // code here.
        List<Long> odd = new ArrayList<>();
        List<Long> even = new ArrayList<>();
        for(long num : arr){
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        
        Collections.sort(odd);
        Collections.reverse(odd);
        Collections.sort(even);
        
        int j = 0;
        for(int i=0;i<odd.size();i++){
            arr[j++] = odd.get(i);
        }
        for(int i=0;i<even.size();i++){
            arr[j++] = even.get(i);
        }
        
        
    } 
}