class kk{
    public static void main(String args[]){
     int n = 5;
     int num = 1;
     int pro = 1;
     int ans = helper(num,pro,n);
     System.out.println(ans);
    }
    
    static int helper(int num, int sum, int n){
        if (num>n){
            return sum;
        }
        else{
            return helper(num+1,sum* num,n);
        }
    }
}
