class kk{
    public static void main(String args[]){
        int n = 27;
        if n<0{
            
        }
        if (n==0){
            System.out.println(true);
        }
        
        System.out.println(helper(n));
    }
    
    static boolean helper(int n){
        if (n<0){
            return false;
        }
        
        if (n==1){
            return true;
        }
        
        if (n%3!=0){
            return false;
        }
        else{
            return helper(n/3);
        }
    }
}
