public class KK{
    public static void main(String[] args){
        int sum = 0;
        int num = 10;
        int n = 0;
        int ans  = summation(sum,num,n);
        System.out.println(ans);
    }
    static int summation(int sum,int num,int n){
        if (num<=n){
            return sum;
        }
        else{
            return summation(sum+num,num-1,n);
        }
        
    }
}
