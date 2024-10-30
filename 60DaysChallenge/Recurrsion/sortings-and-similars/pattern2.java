public class kk{
    public static void main(String args[]){
        int r = 0;
        int c = 0;
        int n = 3;
        pattern(r,c,n);
    }
    
    static void pattern(int r, int c, int n ){
        
        if (r==n){
            return;
        }
        
        if(c<n){
            System.out.print("* ");
            pattern(r,c+1,n);
        }
        else{
            System.out.println();
            pattern(r+1,c=0,n);
            
        }
    
        
    }
}
