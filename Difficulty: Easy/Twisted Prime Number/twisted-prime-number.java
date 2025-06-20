// User function Template for Java

class Solution {
    int isTwistedPrime(int N) {
        // code here
        if(isPrime(N) && isPrime(reverse(N))) return 1;
        return 0;
        
    }
    
    boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=(int)Math.sqrt(n)+1;i++){
            if(n%i==0) return false;
        }
        
        return true;
    }
    
    int reverse(int n){
        int res = 0;
        while(n!=0){
            int last = n%10;
            res = res * 10 + last;
            n = n / 10;
        }
        
        return res;
    }
}