class kk{
    public static void main(String args[]){
        int n = 900000;
        int cnt = 0;
        
        System.out.println(helper(n,cnt));
    }
    static int helper(int n,int cnt){
        if (n==0){
            return cnt;
        }
        int rem = n%10;
        if (rem==0){
            cnt += 1;
        }
        n = n/10;
        return helper(n,cnt);
    }
}
