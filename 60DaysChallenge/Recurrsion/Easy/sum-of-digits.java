public class kk{
    public static void main(String args[]){
        int num = 1234;
        
        int sum = 0;
        
        int ans = helper(num,sum);
        System.out.println(ans);
    }
    
    static int helper(int num, int sum){
        if (num==0){
            return sum;
        }
        
        else{
            int digit = num % 10;
            num = num / 10;
            sum += digit;
            
            return helper(num,sum);
        }
    }
}
